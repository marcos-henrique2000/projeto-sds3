package com.marc.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marc.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
