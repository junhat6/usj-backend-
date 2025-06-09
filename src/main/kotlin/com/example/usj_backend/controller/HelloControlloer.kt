package com.example.usj_backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {

    data class HelloResponse(val message: String)

    @GetMapping("/hello")
    fun hello(): HelloResponse {
        return HelloResponse("Hello, USJ Matching App!")
    }
}