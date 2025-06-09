package com.example.usj_backend.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.view.RedirectView

@Controller
class RootController {

    @GetMapping("/")
    fun redirectToSwagger(): RedirectView {
        return RedirectView("/swagger-ui.html")
    }
} 