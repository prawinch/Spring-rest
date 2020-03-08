package com.qam.app.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping(value = "/compute", produces = "application/json")
    public String greeting(@RequestParam String input) {
        String returnValue = StringUtils.reverse(input);
        String message = String.format("Entered text is : %s and the return value is %s", input, returnValue);
        logger.info(message);
        return message;
    }

    @GetMapping(value = "/", produces = "application/json")
    public String homePage() {
        return "Welcome. This is the home page";
    }
}
