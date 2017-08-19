package com.pluralsight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jingshanyin on 8/16/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "EventTracker here!";
    }
    @RequestMapping("/abc")
    public String home2() {
        return "EventTracker here with abc!";
    }
}
