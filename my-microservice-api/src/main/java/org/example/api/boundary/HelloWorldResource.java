package org.example.api.boundary;

import org.example.api.boundary.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldResource {

    @GetMapping("/greeting")
    public Greeting helloWorld() {
        return new Greeting()
                .setHello("hello")
                .setWorld("world");
    }
}
