package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Home {

    @GetMapping("/")
    def home(){
        "It's works"
    }

}
