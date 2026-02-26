package com.api.rest.controller;

import java.net.BindException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debug")
public class DebugController {

    @GetMapping("/500")
    public void crash500() throws BindException {
        throw new BindException("ERROR VALIDAÇÃO");
//        throw new RuntimeErrorException(null, "Simulated 500 for testing");
    }
}