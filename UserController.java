package com.umesh.SecutiryAunthenticationDemo.controller;

import org.springframework.aot.hint.ResourcePatternHint;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/home")
    public ResponseEntity<?>hello(){

        return ResponseEntity.ok("Hi my name is Umesh And am Loking For Job ");
    }
}
