package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductDao productDao;
	public boolean validateUser(String uname, String upass) {
		
		return productDao.validateUser(uname,upass);
	}
	

}
