package com.dz.otus.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> heath(){
        return Collections.singletonMap("status", "OK");
    }
}
