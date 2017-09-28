/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restandcurl.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mitz
 */
@RestController
@RequestMapping(value = "/request")
public class RequestController {
    @RequestMapping(value = "/call-service", method = RequestMethod.GET)
    public void makeRequest(){
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://127.0.0.1:8080/service/get-name", String.class);
        System.out.println(response+"********");
    }
}
