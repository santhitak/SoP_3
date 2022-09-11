package com.example.lab03service;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{firstNum}/{secNum}", method = RequestMethod.GET)
    public double add(@PathVariable("firstNum") Double firstNum, @PathVariable("secNum") Double secNum) {
        return firstNum+secNum;
    }

    @RequestMapping(value = "/minus/{firstNum}/{secNum}", method = RequestMethod.GET)
    public double minus(@PathVariable("firstNum") Double firstNum, @PathVariable("secNum") Double secNum) {
        return firstNum-secNum;
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public double multiply(@RequestParam Double num1, @RequestParam Double num2) {
        return num1*num2;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public double divide(@RequestParam Double num1, @RequestParam Double num2) {
        return num1/num2;
    }
}