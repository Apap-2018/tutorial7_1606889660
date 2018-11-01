package com.apap.tutorial7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.apap.tutorial7.rest.Setting;

@RestController()
@RequestMapping("/producer")
public class ProducerController {
	@Autowired
    RestTemplate restTemplate2;
    
  
    @GetMapping(value="/listAirport")
    public String postStatus(@RequestParam("city") String city) throws Exception{
    	String path = Setting.producerUrl + "&term=" + city;
    	
    	return restTemplate2.getForEntity(path, String.class).getBody();
    	
    }
}
