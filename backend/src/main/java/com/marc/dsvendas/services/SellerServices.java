package com.marc.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marc.dsvendas.dto.SellerDTO;
import com.marc.dsvendas.entities.Seller;
import com.marc.dsvendas.repositories.SellerRepository;

@Service
public class SellerServices {
	
	@Autowired //injeta a instancia automaticamente 
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
