package com.example.productdetailsservice.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.productdetailsservice.Entity.Product;

public interface ProductService {
	Product save(Product product);
	ArrayList<Product> findAll();
	Product findByproductID(UUID productId);
//	List<Product> getProductByName(String pName);
	
//	List<Product> findProductByName(String pName);
//	ArrayList<Product> findProductByBrand(String pBrand);
//	ArrayList<Product> findProductByCategory(String pCategory);


}
