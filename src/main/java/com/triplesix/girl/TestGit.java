package com.triplesix.girl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGit {
    @RequestMapping(value = "/hellogit",method = RequestMethod.GET)
    public String hello() {
        return "git";
    }
}
