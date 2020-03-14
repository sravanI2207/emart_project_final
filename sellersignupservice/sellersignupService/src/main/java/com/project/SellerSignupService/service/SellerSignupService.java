package com.project.SellerSignupService.service;

import com.project.SellerSignupService.model.SellerSignupPojo;

public interface SellerSignupService {
	
	SellerSignupPojo addSeller( SellerSignupPojo SellerPojo);
	SellerSignupPojo validateSellerSignup(SellerSignupPojo sellerSignupPojo);
	SellerSignupPojo getSeller(Integer id);

}
