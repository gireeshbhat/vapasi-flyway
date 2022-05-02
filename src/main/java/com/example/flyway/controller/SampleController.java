package com.example.flyway.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vapasi")
@Slf4j
@RequiredArgsConstructor
public class SampleController {

    @GetMapping("/greet/{name}")
    public ResponseEntity greet(@PathVariable String name) {
        log.info("hello {} ", name);
        return ResponseEntity.ok().build();
    }
}
