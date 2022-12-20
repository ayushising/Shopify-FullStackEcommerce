package com.example.productdetailsservice.Repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productdetailsservice.Entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger> {

	@SuppressWarnings("unchecked")
	Product save(Product product);
	ArrayList<Product> findAll();
	Product findByproductID(UUID productId);
//	List<Product> findProductByName(String pName);
//	ArrayList<Product> findProductByBrand(String pBrand);
//	ArrayList<Product> findProductByCategory(String pCategory);

	
	
}
