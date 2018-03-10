package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringBootWebApplication {

    // https://dzone.com/articles/spring-boot-restful-api-documentation-with-swagger
    // http://localhost:8080/v2/api-docs
    // http://localhost:8080/swagger-ui.html

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
