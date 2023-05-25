package com.mkpits.Trading.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping(method = RequestMethod.GET, path = "/register")
    public ResponseEntity<String> registerUser() {
        return ResponseEntity.status(HttpStatus.OK).body("Hii Sachin");
    }

    @GetMapping(path = "/user")

    public ResponseEntity<String> getUsers() {

        return ResponseEntity.status(HttpStatus.OK).body("Hello Sk");
    }

    @PostMapping(value = "/ASK")
    public ResponseEntity<String> getUsers1() {

        return ResponseEntity.status(HttpStatus.OK).body("Jai Bajranbali");
    }

    @PutMapping(value = "/sk")
    public ResponseEntity<String> getUsers2() {

        return ResponseEntity.status(HttpStatus.OK).body("Jai Shree Ram");

    }
}