package com.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by korte on 29.08.2016.
 */
@RestController
public class OneMoreController {

    @RequestMapping(value = "/smth")
    public String smth() {
        return "smth";
    }

}
