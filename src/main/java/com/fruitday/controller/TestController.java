package com.fruitday.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  * 测试controller
 *   *
 *    * @author liucheng
 *     **/
@RestController
public class TestController {
    @RequestMapping("/index")
    public String method() {
        return "hello world brande & angel!";
    }
}

