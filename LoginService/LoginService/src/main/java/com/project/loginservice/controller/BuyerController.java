package com.project.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.loginservice.pojo.BuyerSignupPojo;
import com.project.loginservice.service.BuyerSignupService;

@RestController
@CrossOrigin
@RequestMapping("emart")

public class BuyerController {

	@Autowired
	BuyerSignupService buyerService;

	@GetMapping("validate")
	BuyerSignupPojo validateBuyerSignup(@RequestHeader("Authorization") String data) {
		
		String token[] = data.split(":");
		BuyerSignupPojo buyerSignupPojo = new BuyerSignupPojo();
		buyerSignupPojo.setUsername(token[0]);
		buyerSignupPojo.setPassword(token[1]);

		return buyerService.validateBuyersignup(buyerSignupPojo);
		
	}

	@GetMapping("/buyer/{id}")
	BuyerSignupPojo getBuyer(@PathVariable("id") Integer id) {
		
		return buyerService.getBuyer(id);
	}
	
	@PostMapping("/buyer")
	BuyerSignupPojo addBuyer(@RequestBody BuyerSignupPojo buyerSignupPojo)
	{
		return buyerService.addBuyer(buyerSignupPojo);
	}

}
