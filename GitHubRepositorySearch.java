import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GitHubRepositorySearch {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do repositório: ");
        String repositoryName = scanner.nextLine();

        searchRepositories(repositoryName);
    }

    private static void searchRepositories(String repoName) {
        try {
            String url = String.format(
                    "https://api.github.com/search/repositories?q=%s+in:name",
                    URLEncoder.encode(repoName, StandardCharsets.UTF_8)
            );

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/vnd.github+json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            JsonNode root = MAPPER.readTree(response.body());
            JsonNode items = root.get("items");

            List<RepositoryDto> repositories = new ArrayList<>();

            for (JsonNode repo : items) {
                repositories.add(new RepositoryDto(
                        repo.get("id").asLong(),
                        repo.get("name").asText(),
                        repo.get("full_name").asText(),
                        repo.get("owner").get("login").asText(),
                        repo.get("stargazers_count").asInt(),
                        repo.get("html_url").asText()
                ));
            }

            System.out.println(
                    MAPPER.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(repositories)
            );

        } catch (Exception e) {
            System.err.println("Erro ao consultar GitHub: " + e.getMessage());
        }
    }

    public record RepositoryDto(
            long id,
            String name,
            String fullName,
            String owner,
            int stars,
            String url
    ) {
    }
}

// Output: json.stringify result
