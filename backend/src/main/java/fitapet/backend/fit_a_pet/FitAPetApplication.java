package fitapet.backend.fit_a_pet;

import fitapet.backend.fit_a_pet.util.YamlLoadFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class FitAPetApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitAPetApplication.class, args);
    }

}
