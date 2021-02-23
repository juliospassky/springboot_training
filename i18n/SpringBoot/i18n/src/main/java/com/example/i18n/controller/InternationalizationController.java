package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternationalizationController {

    @GetMapping("/hello")
    public String get() {
        return "A";
    }
}
