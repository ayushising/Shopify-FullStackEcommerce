package com.example.productdetailsservice.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Service.ProductService;

@RestController
@RequestMapping("/shopify/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@GetMapping("/getAllProducts")
	public ArrayList<Product> getAllProducts() {
		return productService.findAll();
	}
	
	@GetMapping("/getId/{productId}")
	public Product getProductById(@PathVariable UUID productId) {
		return productService.findByproductID(productId);
	}
	
	
//	@GetMapping("/search/{pName}")
//	public List<Product> getProductByName(@PathVariable String pName) {
//		return productService.findProductByName(pName);
//	}
//	@GetMapping("/search/{pBrand}")
//	public ArrayList<Product> getProductByBrand(@PathVariable String pBrand) {
//		return productService.getProductByBrand(pBrand);
//	}
//	@GetMapping("/search/{pCategory}")
//	public ArrayList<Product> getProductByCategory(@PathVariable String pCategory) {
//		return productService.getProductByCategory(pCategory);
//	}

}
