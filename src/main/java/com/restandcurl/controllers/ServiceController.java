/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restandcurl.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mitz
 */
@RestController
@RequestMapping(value = "/service")
public class ServiceController {
    @RequestMapping(value = "/get-name", method = RequestMethod.GET)
    public @ResponseBody String getName(){
        return "amit";
    }
}
