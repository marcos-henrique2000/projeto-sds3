package com.marc.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marc.dsvendas.dto.SellerDTO;
import com.marc.dsvendas.services.SellerServices;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerServices service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
}
