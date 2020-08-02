package de.braincoooler.sandbox.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainControllerImpl implements MainController {
    @Override
    @GetMapping(path = "/test")
    public ResponseEntity<?> getDefault() {
        return ResponseEntity.ok("Hello");
    }
}
