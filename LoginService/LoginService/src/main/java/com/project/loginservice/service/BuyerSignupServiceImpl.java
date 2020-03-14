package com.project.loginservice.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.loginservice.dao.BuyerSignupDao;
import com.project.loginservice.entity.BillDetailsEntity;
import com.project.loginservice.entity.BillEntity;
import com.project.loginservice.entity.BuyerSignupEntity;
import com.project.loginservice.entity.CategoryEntity;
import com.project.loginservice.entity.ItemEntity;
import com.project.loginservice.entity.SellerSignupEntity;
import com.project.loginservice.entity.SubCategoryEntity;
import com.project.loginservice.pojo.BillDetailsPojo;
import com.project.loginservice.pojo.BillPojo;
import com.project.loginservice.pojo.BuyerSignupPojo;
import com.project.loginservice.pojo.CategoryPojo;
import com.project.loginservice.pojo.ItemPojo;
import com.project.loginservice.pojo.SellerSignupPojo;
import com.project.loginservice.pojo.SubCategoryPojo;


@Service
public class BuyerSignupServiceImpl implements BuyerSignupService {

	@Autowired
	BuyerSignupDao buyerDao;

	@Override
	public BuyerSignupPojo validateBuyersignup(BuyerSignupPojo buyerSignupPojo) {

		System.out.println("username:" + buyerSignupPojo.getUsername());
		System.out.println("password:" + buyerSignupPojo.getPassword());
		BuyerSignupEntity buyerSignupEntity = buyerDao.findByUsernameAndPassword(buyerSignupPojo.getUsername(),
				buyerSignupPojo.getPassword());
		System.out.println(buyerSignupEntity);
		
		if (buyerSignupEntity != null) {
			
			Set<BillEntity> allBillsEntity = buyerSignupEntity.getAllBills();
			Set<BillPojo> allBillPojo = new HashSet<BillPojo>();
			
			
			for (BillEntity billEntity : allBillsEntity) {
				
				Set<BillDetailsEntity> allBillDetailsEntity = billEntity.getAllBillDetails();
				Set<BillDetailsPojo> allBillDetailsPojo = new HashSet<BillDetailsPojo>();
				
				for (BillDetailsEntity billDetailsEntity : allBillDetailsEntity) {
					
					ItemEntity itemEntity = billDetailsEntity.getItemId();
					SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
					CategoryEntity categoryEntity = subCategoryEntity.getCategory();
					SellerSignupEntity sellerSignupEntity = itemEntity.getSeller();
					CategoryPojo categoryPojo = new CategoryPojo(
																categoryEntity.getId(), 
																categoryEntity.getName(),
																categoryEntity.getBrief()
																);
					//
					SubCategoryPojo subCategoryPojo = new SubCategoryPojo(
																subCategoryEntity.getId(),
																subCategoryEntity.getName(), 
																subCategoryEntity.getBrief(),
																subCategoryEntity.getGstPercent(),
																categoryPojo
																);
					//
					SellerSignupPojo sellerPojo = new SellerSignupPojo(
																sellerSignupEntity.getId(),
																sellerSignupEntity.getUsername(), 
																sellerSignupEntity.getPassword(),
																sellerSignupEntity.getCompany(), 
																sellerSignupEntity.getBrief(), 
																sellerSignupEntity.getGst(),
																sellerSignupEntity.getAddress(), 
																sellerSignupEntity.getEmail(),
																sellerSignupEntity.getWebsite(), 
																sellerSignupEntity.getContact()
																);
					ItemPojo itemPojo = new ItemPojo(
														itemEntity.getId(), 
														itemEntity.getName(),
														itemEntity.getImage(),
														itemEntity.getPrice(), 
														itemEntity.getStock(), 
														itemEntity.getDescription(),
														itemEntity.getRemarks(),
														sellerPojo, 
														subCategoryPojo
														);
					BillDetailsPojo billDetailsPojo = new BillDetailsPojo(
																			billDetailsEntity.getId(),
																			null, 
																			itemPojo	
																			);
					allBillDetailsPojo.add(billDetailsPojo);
					
					
				}
				BillPojo billPojo = new BillPojo(
						billEntity.getId(),
						null,
						billEntity.getType(),
						billEntity.getDate(),
						billEntity.getRemarks(),
						billEntity.getAmount(),
						allBillDetailsPojo
						);
				allBillPojo.add(billPojo);
				
			}
			buyerSignupPojo = new BuyerSignupPojo(
					buyerSignupEntity.getId(),
					allBillPojo,
					buyerSignupEntity.getUsername(),
					buyerSignupEntity.getPassword(), 
					buyerSignupEntity.getEmail(),
					buyerSignupEntity.getMobile(),
					buyerSignupEntity.getDate()
					
					);

		}

		return buyerSignupPojo;
	}


	@Override
	public BuyerSignupPojo getBuyer(Integer id) {
		BuyerSignupPojo buyerSignuppojo = null;
		BuyerSignupEntity buyerSignupEntity = buyerDao.findById(id).get();
		System.out.println("get:" + buyerSignupEntity);
		if (buyerSignupEntity != null) {
			
			Set<BillEntity> allBillsEntity = buyerSignupEntity.getAllBills();
			Set<BillPojo> allBillPojo = new HashSet<BillPojo>();
			
			
			for (BillEntity billEntity : allBillsEntity) {
				
				Set<BillDetailsEntity> allBillDetailsEntity = billEntity.getAllBillDetails();
				Set<BillDetailsPojo> allBillDetailsPojo = new HashSet<BillDetailsPojo>();
				
				for (BillDetailsEntity billDetailsEntity : allBillDetailsEntity) {
					
					ItemEntity itemEntity = billDetailsEntity.getItemId();
					SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
					CategoryEntity categoryEntity = subCategoryEntity.getCategory();
					SellerSignupEntity sellerSignupEntity = itemEntity.getSeller();
					CategoryPojo categoryPojo = new CategoryPojo(
																categoryEntity.getId(), 
																categoryEntity.getName(),
																categoryEntity.getBrief()
																);
					SubCategoryPojo subCategoryPojo = new SubCategoryPojo(
																subCategoryEntity.getId(),
																subCategoryEntity.getName(), 
																subCategoryEntity.getBrief(),
																subCategoryEntity.getGstPercent(),
																categoryPojo
																);
					SellerSignupPojo sellerPojo = new SellerSignupPojo(
																sellerSignupEntity.getId(),
																sellerSignupEntity.getUsername(), 
																sellerSignupEntity.getPassword(),
																sellerSignupEntity.getCompany(), 
																sellerSignupEntity.getBrief(), 
																sellerSignupEntity.getGst(),
																sellerSignupEntity.getAddress(), 
																sellerSignupEntity.getEmail(),
																sellerSignupEntity.getWebsite(), 
																sellerSignupEntity.getContact()
																);
					ItemPojo itemPojo = new ItemPojo(
														itemEntity.getId(), 
														itemEntity.getName(),
														itemEntity.getImage(),
														itemEntity.getPrice(), 
														itemEntity.getStock(), 
														itemEntity.getDescription(),
														itemEntity.getRemarks(),
														sellerPojo, 
														subCategoryPojo
														);
					BillDetailsPojo billDetailsPojo = new BillDetailsPojo(
																			billDetailsEntity.getId(),
																			null, 
																			itemPojo	
																			);
					allBillDetailsPojo.add(billDetailsPojo);
				}
					
				
				BillPojo billPojo = new BillPojo(
						billEntity.getId(),
						null,
						billEntity.getType(),
						billEntity.getDate(),
						billEntity.getRemarks(),
						billEntity.getAmount(),
						allBillDetailsPojo
						);
				allBillPojo.add(billPojo);
				
				}
					buyerSignuppojo = new BuyerSignupPojo(
					buyerSignupEntity.getId(),
					allBillPojo,
					buyerSignupEntity.getUsername(),
					buyerSignupEntity.getPassword(), 
					buyerSignupEntity.getEmail(),
					buyerSignupEntity.getMobile(),
					buyerSignupEntity.getDate());
	
}
		
		return buyerSignuppojo;
	}


	@Override
	public BuyerSignupPojo addBuyer(BuyerSignupPojo buyerSignupPojo) {
		BuyerSignupEntity buyerSignupEntity = new BuyerSignupEntity(
				null,
				null, 
				buyerSignupPojo.getUsername(),
				buyerSignupPojo.getPassword(), 
				buyerSignupPojo.getEmail(),
				buyerSignupPojo.getMobile(),
				buyerSignupPojo.getDate());
		
		buyerDao.saveAndFlush(buyerSignupEntity);
		buyerSignupPojo.setId(buyerSignupEntity.getId());
		return buyerSignupPojo;
	}
}
