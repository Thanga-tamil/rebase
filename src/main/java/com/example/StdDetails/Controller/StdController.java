package com.example.StdDetails.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StdController {
    @RequestMapping("/show")
    public String show() {
        return "hello spring Boot";
    }

}
