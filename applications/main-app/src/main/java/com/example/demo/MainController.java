package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class MainController {

    private FizHandler fizHandler = new FizHandler();

    @GetMapping("/test")
    public String test(@RequestParam("number") Integer number) {
        log.info("Test method");

        return fizHandler.isEvenOrOdd(number);
    }
}
