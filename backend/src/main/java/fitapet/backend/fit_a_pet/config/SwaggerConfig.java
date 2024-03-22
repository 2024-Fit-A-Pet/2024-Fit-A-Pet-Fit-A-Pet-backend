package fitapet.backend.fit_a_pet.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info().
                title("Fit A Pet API").
                version("API v1.0").
                description("동물의 건강을 케어하는 플랫폼 Fit A Pet API 문서입니다.");
    }

}