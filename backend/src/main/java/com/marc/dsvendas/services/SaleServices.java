package com.marc.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marc.dsvendas.dto.SaleDTO;
import com.marc.dsvendas.dto.SaleSuccessDTO;
import com.marc.dsvendas.dto.SaleSumDTO;
import com.marc.dsvendas.entities.Sale;
import com.marc.dsvendas.repositories.SaleRepository;
import com.marc.dsvendas.repositories.SellerRepository;

@Service
public class SaleServices {
	
	@Autowired //injeta a instancia automaticamente 
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller(){
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller(){
		return repository.successGroupBySeller();
	}
}