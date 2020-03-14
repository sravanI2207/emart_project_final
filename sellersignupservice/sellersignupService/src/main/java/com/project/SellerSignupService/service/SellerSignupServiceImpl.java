package com.project.SellerSignupService.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.SellerSignupService.dao.SellerSignupDao;
import com.project.SellerSignupService.dao.entity.CategoryEntity;
import com.project.SellerSignupService.dao.entity.ItemEntity;
import com.project.SellerSignupService.dao.entity.SellerSignupEntity;
import com.project.SellerSignupService.dao.entity.SubCategoryEntity;
import com.project.SellerSignupService.model.CategoryPojo;
import com.project.SellerSignupService.model.ItemPojo;
import com.project.SellerSignupService.model.SellerSignupPojo;
import com.project.SellerSignupService.model.SubCategoryPojo;

@Service

public class SellerSignupServiceImpl implements SellerSignupService {
	
	
	@Autowired
	SellerSignupDao sellerDao;

	@Override
	public SellerSignupPojo addSeller(SellerSignupPojo sellerSignupPojo) {
		
		SellerSignupEntity SellerSignupEntity = new SellerSignupEntity(sellerSignupPojo.getId(),
				                                sellerSignupPojo.getUsername(),
				                                sellerSignupPojo.getPassword(),
											    sellerSignupPojo.getCompany(),
											    sellerSignupPojo.getBrief(),
											    sellerSignupPojo.getGst(),
											    sellerSignupPojo.getAddress(),
											    sellerSignupPojo.getEmail(),
											    sellerSignupPojo.getContact(),
											    sellerSignupPojo.getWebsite(),
											    null);
											   
		sellerDao.save(SellerSignupEntity);
		
		return sellerSignupPojo;

		
	}

	@Override
	public SellerSignupPojo validateSellerSignup(SellerSignupPojo sellerSignupPojo) {
		SellerSignupEntity sellerSignupEntity= sellerDao.findByUsernameAndPassword(sellerSignupPojo.getUsername(),sellerSignupPojo.getPassword() );
		if (sellerSignupEntity != null) {


		Set<ItemEntity> allItemEntity = sellerSignupEntity.getAllItems();
		Set<ItemPojo> allItems= new HashSet<ItemPojo>();
		for(ItemEntity itemEntity : allItemEntity) {
		SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
		CategoryEntity categoryEntity = subCategoryEntity.getCategory();
		
		CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getId(), 
				                                     categoryEntity.getName(),
		                                             categoryEntity.getBrief());
		
		SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getId(),
		                                subCategoryEntity.getName(),  
		                                subCategoryEntity.getBrief(),
		                                subCategoryEntity.getGstPercent(),
		                                categoryPojo);
		
		ItemPojo itemPojo = new ItemPojo(itemEntity.getId(),
				                   itemEntity.getName(),
				                   itemEntity.getImage(),
				                   itemEntity.getPrice(),
				                   itemEntity.getStock(), 
		                           itemEntity.getDescription(),
		                           itemEntity.getRemarks(), 
		                           null,
		                           subCategoryPojo);
		
		allItems.add(itemPojo);
		}
		sellerSignupPojo = new SellerSignupPojo(sellerSignupEntity.getId(),
		                             sellerSignupEntity.getUsername(), 
		                             sellerSignupEntity.getPassword(),
		                             sellerSignupEntity.getCompany(),
		                             sellerSignupEntity.getBrief(),
		                             sellerSignupEntity.getGst(),
		                             sellerSignupEntity.getAddress(), 
		                             sellerSignupEntity.getEmail(),
		                             sellerSignupEntity.getContact(),
		                             sellerSignupEntity.getWebsite(),
		                             allItems);
		}

		return sellerSignupPojo;
	}

	@Override
	public SellerSignupPojo getSeller(Integer id) {
		
		return null;
	}



	



	

}
