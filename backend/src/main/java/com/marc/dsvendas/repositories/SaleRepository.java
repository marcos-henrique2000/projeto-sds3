package com.marc.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marc.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
