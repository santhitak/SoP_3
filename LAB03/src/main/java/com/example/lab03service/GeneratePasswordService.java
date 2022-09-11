package com.example.lab03service;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{user}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("user") String user) {
        Random rand = new Random();
        int randomNum = rand.nextInt((999999 - 111111) + 1) + 111111;
        return "Hi, " + user + "\nYour new password is " + randomNum;
    }
}
