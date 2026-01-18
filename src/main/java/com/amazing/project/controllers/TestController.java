package com.amazing.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping(value = "/info", produces = "application/json")
    public String getTestInfo() {
        log.info("getTestInfo started");
        return "{\"message\": \"This is test information\"}";
    }
}