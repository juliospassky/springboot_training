package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/i18n")
public class internationalizationController {

    @GetMapping()
    public String get() {
        return "A";
    }
}
