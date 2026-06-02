const axios = require('axios');

const repositoryName = prompt('Nome do repositório: ');

async function searchRepositories(repoName) {
    try {
        const response = await axios.get(
            `https://api.github.com/search/repositories?q=${encodeURIComponent(repoName)}+in:name`
        );

        const repositories = response.data.items.map(repo => ({
            id: repo.id,
            name: repo.name,
            fullName: repo.full_name,
            owner: repo.owner.login,
            stars: repo.stargazers_count,
            url: repo.html_url
        }));

        console.log(JSON.stringify(repositories, null, 2));
    } catch (error) {
        console.error('Erro ao consultar GitHub:', error.message);
    }
}

searchRepositories(repositoryName); 

// Output: json.stringify result
