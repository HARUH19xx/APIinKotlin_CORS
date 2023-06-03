package com.example.APIinKotlin_CORS

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
class ToDoController() {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }

    @GetMapping("/todo")
    fun todo(): String {
        return "todo"
    }
}