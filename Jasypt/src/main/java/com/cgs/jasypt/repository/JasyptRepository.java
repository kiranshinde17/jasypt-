package com.cgs.jasypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgs.jasypt.entity.JasyptDetails;

public interface JasyptRepository extends JpaRepository<JasyptDetails, Long>{

}
