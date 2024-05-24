package com.cgs.jasypt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.jasypt.entity.JasyptDetails;
import com.cgs.jasypt.repository.JasyptRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JasyptServiceImpl implements JasyptService {
	
	@Autowired
	JasyptRepository jasyptRepository;

	@Override
	public void registerJasypt(JasyptDetails jasyptdetails) {
		log.info("Register Jasypt Details");
		
		jasyptRepository.save(jasyptdetails);
		
	}

}
