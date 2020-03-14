package com.project.buyeritemservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.buyeritemservice.entity.BillDetailsEntity;



public interface BillDetailsDao extends JpaRepository<BillDetailsEntity,Integer> {

}
