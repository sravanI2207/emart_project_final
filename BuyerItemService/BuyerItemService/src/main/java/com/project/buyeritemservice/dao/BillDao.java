package com.project.buyeritemservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.buyeritemservice.entity.BillEntity;




public interface BillDao extends JpaRepository<BillEntity,Integer> {

}
