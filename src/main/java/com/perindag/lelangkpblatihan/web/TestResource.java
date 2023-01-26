package com.perindag.lelangkpblatihan.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok().body("Hello, Welcome to e-Lelang KPB");
    }

    @GetMapping("/{msg}")
    public ResponseEntity<String> getMessage(@PathVariable("msg") String message) {
        return ResponseEntity.ok().body("Your message is: " + message);
    }
}
