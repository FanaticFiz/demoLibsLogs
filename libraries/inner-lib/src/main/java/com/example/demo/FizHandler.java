package com.example.demo;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FizHandler {

    public String isEvenOrOdd(Integer number) {
        log.info("isEvenOrOdd");

        return number % 2 == 0 ? "Even" : "Odd";
    }

}
