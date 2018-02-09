package com.itest123.bot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jing-fan.pu on 2018/2/9.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "hello world!";
    }

}
