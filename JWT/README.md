# JWT
JSON Web Token (JWT) in Spring Boot is a widely used approach for implementing stateless authentication and authorization in RESTful APIs. It offers a secure and efficient way to verify user identities and control access to protected resources without relying on server-side sessions.

# JWT Architecture
<img src='https://github.com/AbhishekGandre/JWT/blob/main/jwt_img.png'></img>

# Dependencies
```<pre><dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-impl</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-jackson</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

# Test with Postman or curl
```
POST /auth/login
Content-Type: application/json

{
  "username": "user",
  "password": "password"
}
```
Login using credentials and Get JWT.

# Access Secured Endpoint
```
GET /secure
Authorization: Bearer <your_token>
```

<h6>Note : Password should be encoded (Bcrytpo)</h6>
