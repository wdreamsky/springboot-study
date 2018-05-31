package com.iwy.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: biwei2
 * @Data: 17:25 2018/5/30
 * @Email: biwei2@iflytek.com
 * @Desc:
 * @Modify By:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "hello spring boot";
    }

    @GetMapping("/getInfo")
    public Map<String, String> getInfo(@RequestParam String userName) {
        Map<String, String> map = new HashMap();
        map.put("name", userName);
        return map;
    }

    @GetMapping("/getList")
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add("weibi" + i);
        }
        return list;
    }

}
