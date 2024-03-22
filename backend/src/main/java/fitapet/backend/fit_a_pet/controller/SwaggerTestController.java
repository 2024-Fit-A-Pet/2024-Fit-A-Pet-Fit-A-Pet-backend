package fitapet.backend.fit_a_pet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerTestController {
    @GetMapping("/api/test")
    public String test() {
        return "test";
    }
}
