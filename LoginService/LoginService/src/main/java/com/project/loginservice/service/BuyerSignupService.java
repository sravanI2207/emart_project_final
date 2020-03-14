package com.project.loginservice.service;

import com.project.loginservice.pojo.BuyerSignupPojo;

public interface BuyerSignupService {

	BuyerSignupPojo validateBuyersignup(BuyerSignupPojo buyerSignupPojo);
	BuyerSignupPojo getBuyer(Integer id);
	BuyerSignupPojo addBuyer(BuyerSignupPojo buyerSignupPojo);
}
