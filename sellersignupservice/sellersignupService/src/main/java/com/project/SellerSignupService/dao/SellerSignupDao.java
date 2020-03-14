package com.project.SellerSignupService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.SellerSignupService.dao.entity.SellerSignupEntity;

@Repository

public interface SellerSignupDao extends JpaRepository<SellerSignupEntity,Integer> {

	SellerSignupEntity findByUsernameAndPassword(String username, String password);

}
