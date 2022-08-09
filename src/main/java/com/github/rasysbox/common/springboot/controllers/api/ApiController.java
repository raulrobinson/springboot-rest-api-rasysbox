package com.github.rasysbox.common.springboot.controllers.api;

import com.github.rasysbox.common.springboot.utils.Hello;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    @Operation(hidden = true)
    public Hello index() {
        return () -> "Is a live!";
    }
}
