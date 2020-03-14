package com.project.SellerSignupService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.SellerSignupService.model.SellerSignupPojo;
import com.project.SellerSignupService.service.SellerSignupService;

@CrossOrigin
@RestController
@RequestMapping("emart")


public class SellerSignupServiceController
{
	
	@Autowired
	SellerSignupService sellerService;
	
	@GetMapping("validate")
	SellerSignupPojo validateSellerSignup(@RequestHeader("Authorization") String data) {
		
		String token[] = data.split(":");
		SellerSignupPojo sellerSignupPojo = new SellerSignupPojo();
		sellerSignupPojo.setUsername(token[0]);
		sellerSignupPojo.setPassword(token[1]);

		return sellerService.validateSellerSignup(sellerSignupPojo);
		
	}
	
	@GetMapping("/seller/{id}")
	SellerSignupPojo getBuyer(@PathVariable("id") Integer id) {
		
		return sellerService.getSeller(id);
	}
	
	@PostMapping("/seller")
	SellerSignupPojo addSeller(@RequestBody SellerSignupPojo sellerSignupPojo)
	{
		return sellerService.addSeller(sellerSignupPojo);
	}
	
	
	
}
