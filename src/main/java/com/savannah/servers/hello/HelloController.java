package com.savannah.servers.hello;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Hello", description = "HelloController API for connection test")
public class HelloController {

    @GetMapping()
    public String Hello() {
        return "Hello, Savannah :)";
    }

}