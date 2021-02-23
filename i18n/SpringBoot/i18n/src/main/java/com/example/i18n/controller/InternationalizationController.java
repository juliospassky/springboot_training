package com.example.i18n.controller;

import com.example.i18n.i18n.MessagesProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InternationalizationController {

    @GetMapping("/hello")
    public String get() {
        return MessagesProperties.MSG_EXCEPTION_100.getMs() + " " + MessagesProperties.MSG_EXCEPTION_100.toString();
    }
}
