package com.elk.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/log")
    public String generateLog() {
        log.info("Log generated at {}", LocalDateTime.now());
        generate();
        return "Log sent to ELK stack!" + LocalDateTime.now().toString()+generate();
    }

    public String generate(){
        log.trace("Log generated at {}", LocalDateTime.now());
        log.debug("Log sent to ELK stack");
        log.warn("Log sent to ELK stack");
        log.error("Log sent to EL");
       return "Hello";
    }
}
