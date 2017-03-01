package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Home {

    @Autowired
    CharacterRepository repository

    @GetMapping("/hello")
    def home() {
        List<Character> characterList = repository.findAll()
        return characterList.name.join(",")
    }

}
