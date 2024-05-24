package com.cgs.jasypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgs.jasypt.entity.JasyptDetails;
import com.cgs.jasypt.service.JasyptService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JasyptController {
	
	
	@Autowired
	private JasyptService jasyptService;

	@RequestMapping(value = "/msg", method = RequestMethod.GET)
	public String jasyptMsg() {
		log.info("Jasypt ..!!");
		String msg = "Jasypt App is Working!!";
		return msg;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveJasyptMsg(@RequestBody JasyptDetails jasyptdetails) {
		log.info("Jasypt ..!!");
		jasyptService.registerJasypt(jasyptdetails);
		String msg = "Jasypt deatils saved!!";
		return msg;
	}
}
