package com.example.productdetailsservice.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Service;
import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;

//	public Product saveDataToDB(Product product) {
//		product.setProductID(UUID.randomUUID());
//		return productRepo.save(product);
//	}
//	
//	public ArrayList<Product> findAllProducts() {
//		return productRepo.findAll();
//	}
//	
//	public Product getProductDetails(UUID productId) {
//		return productRepo.findByproductID(productId);
//	}

	@Override
	public Product save(Product product) {
		product.setProductID(UUID.randomUUID());
		return productRepo.save(product);
	
	}

	@Override
	public ArrayList<Product> findAll() {
		return (ArrayList<Product>) productRepo.findAll();
	}

	@Override
	public Product findByproductID(UUID productId) {
		return productRepo.findByproductID(productId);
	}
	
//	public Product getProductByName(String pName) {
//		return productRepo.findProductByName(pName);
//		
//		
//	}
	
//	public List<Product> findProductByName(String searchPhrase) {
//		
//
//	
//        TextCriteria criteria = TextCriteria
//                                    .forDefaultLanguage()
//                                    .matchingPhrase(searchPhrase);
//        
//        Query query = TextQuery.queryText(criteria).sortByScore();
//        
//        List<Product> products = ((MongoTemplate) productRepo).find(query, Product.class);
//        return products;
//        }

//	public ArrayList<Product> getProductByBrand(String pBrand) {
//		return productRepo.findProductByBrand(pBrand);
//	
//	}
//	public ArrayList<Product> getProductByCategory(String pCategory) {
//		return productRepo.findProductByCategory(pCategory);
//	}
}
