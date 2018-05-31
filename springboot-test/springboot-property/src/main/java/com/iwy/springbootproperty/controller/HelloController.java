package com.iwy.springbootproperty.controller;

import org.springframework.beans.factory.annotation.Value;
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
 * @Desc: 基于restful 规范
 * @Modify By:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${weibi.english.name}")
    private String name;

    @Value("${weibi.msg}")
    private String msg;

    @Value("${weibi.number}")
    private Integer number;

    @GetMapping("")
    public String hello() {
        return "hello spring boot,," + number;
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
