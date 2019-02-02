package com.sun.springcloudfeign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @className: FeignController
 * @description: feign test
 * @author: Jay Sun
 * @create: 2018/12/24 11:26
 **/
@RestController
@RequestMapping("/feign")
public class FeignController {

    @GetMapping("/test")
    public Map<String, Object> feignTest(@RequestParam String name) {
        System.out.println("name=>" + name);

        Map<String, Object> result = new HashMap();
        result.put("name", Optional.ofNullable(name).orElse("") + "-feign");

        return result;
    }

}
