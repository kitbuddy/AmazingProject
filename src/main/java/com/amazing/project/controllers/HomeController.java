package com.amazing.project.controllers;

import com.amazing.project.models.Home;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping(value = "/home",
            produces = "application/json")
    public Home getHomeData() {
        log.info("getHomeData started");
        return Home
                .builder()
                .id(1)
                .name("first")
                .value(550000)
                .build();

    }
}
