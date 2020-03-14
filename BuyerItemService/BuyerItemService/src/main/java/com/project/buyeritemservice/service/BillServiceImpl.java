package com.project.buyeritemservice.service;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.buyeritemservice.dao.BillDao;
import com.project.buyeritemservice.dao.BillDetailsDao;
import com.project.buyeritemservice.entity.BillDetailsEntity;
import com.project.buyeritemservice.entity.BillEntity;
import com.project.buyeritemservice.entity.BuyerSignupEntity;
import com.project.buyeritemservice.entity.CategoryEntity;
import com.project.buyeritemservice.entity.ItemEntity;
import com.project.buyeritemservice.entity.SellerSignupEntity;
import com.project.buyeritemservice.entity.SubCategoryEntity;
import com.project.buyeritemservice.pojo.BillDetailsPojo;
import com.project.buyeritemservice.pojo.BillPojo;
import com.project.buyeritemservice.pojo.BuyerSignupPojo;
import com.project.buyeritemservice.pojo.CategoryPojo;
import com.project.buyeritemservice.pojo.ItemPojo;
import com.project.buyeritemservice.pojo.SellerSignupPojo;
import com.project.buyeritemservice.pojo.SubCategoryPojo;



@Service
public class BillServiceImpl implements BillService
{
	
	@Autowired
	BillDao billDao;
	
	@Autowired
	BillDetailsDao billDetailsDao;
	
	@Override
	@Transactional
	public BillPojo saveBill(BillPojo billPojo) {
		BuyerSignupPojo buyerSignupPojo =billPojo.getBuyer();
		
		
		BuyerSignupEntity buyerSignupEntity =new BuyerSignupEntity(buyerSignupPojo.getId(),
				                              null,
				                            buyerSignupPojo.getUsername(),
				                            buyerSignupPojo.getPassword(),
				                            buyerSignupPojo.getEmail(),
				                            buyerSignupPojo.getMobile(),
				                            buyerSignupPojo.getDate());
		
		BillEntity billEntity=new BillEntity();
		billEntity.setId(0);
		billEntity.setBuyer(buyerSignupEntity);
		billEntity.setType(billPojo.getType());
		billEntity.setDate(billPojo.getDate());
		billEntity.setRemarks(billPojo.getRemarks());
		billEntity.setAmount(billPojo.getAmount());
		
		billEntity =billDao.saveAndFlush(billEntity);
		billPojo.setId(billEntity.getId());
		
		BillEntity setBillEntity =billDao.findById(billEntity.getId()).get();
		

        Set<BillDetailsEntity>allBillDetailsEntity = new HashSet<BillDetailsEntity>();
		Set<BillDetailsPojo> allBillDetailsPojo = billPojo.getAllBillDetails();
		
		for(BillDetailsPojo billDetailsPojo :allBillDetailsPojo)
		{
			
			ItemPojo itemPojo = billDetailsPojo.getItem();
			SubCategoryPojo subCategoryPojo = itemPojo.getSubCategory();
			CategoryPojo categoryPojo = subCategoryPojo.getCategory();
			SellerSignupPojo sellerSignupPojo = itemPojo.getSeller();
			
			SellerSignupEntity sellerSignupEntity = new SellerSignupEntity(sellerSignupPojo.getId(),
					sellerSignupPojo.getUsername(),
					sellerSignupPojo.getPassword(),
					sellerSignupPojo.getCompany(),
					sellerSignupPojo.getBrief(),
					sellerSignupPojo.getGst(),
					sellerSignupPojo.getAddress(),
					sellerSignupPojo.getEmail(),
					sellerSignupPojo.getWebsite(),
					sellerSignupPojo.getContact());
	
		
		
		CategoryEntity categoryEntity = new CategoryEntity(categoryPojo.getId(),
                                                  categoryPojo.getName(),
                                                 categoryPojo.getBrief());
		
		
		SubCategoryEntity subCategoryEntity=new SubCategoryEntity(subCategoryPojo.getId(),
				                            subCategoryPojo.getName(),
				                            categoryEntity,
				                            subCategoryPojo.getBrief(),
				                             subCategoryPojo.getGstPercent());
		
		ItemEntity itemEntity = new ItemEntity(
				itemPojo.getId(),  
				itemPojo.getName(),
				itemPojo.getImage(),
				itemPojo.getPrice(), 
				itemPojo.getStock(), 
				itemPojo.getDescription(),
				itemPojo.getRemarks(),
				sellerSignupEntity, 
				subCategoryEntity);
		
		BillDetailsEntity billDetailsEntity=new BillDetailsEntity(billDetailsPojo.getId(),
			                                                 	setBillEntity,
			                                                 	itemEntity);
		billDetailsDao.save(billDetailsEntity);
		
		}

		return billPojo;
	}
	
		
}
