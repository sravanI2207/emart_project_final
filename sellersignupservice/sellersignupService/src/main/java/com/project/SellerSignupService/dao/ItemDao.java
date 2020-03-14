package com.project.SellerSignupService.dao;

import com.project.SellerSignupService.dao.entity.ItemEntity;

public interface ItemDao {

	Iterable<ItemEntity> findAll();

}
