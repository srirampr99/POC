package com.ws.business;

import java.util.ArrayList;
import java.util.List;

import com.ws.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	List<String> computerList = new ArrayList<>();
	
	public ProductServiceImpl ()
	{
		bookList.add("Inferno");
		bookList.add("Joyland");
		
		musicList.add("Nirvana");
		musicList.add("Backstreet Boys");
		
		movieList.add("Life");
		movieList.add("Independence Day");
		
		computerList.add("Apple");
		computerList.add("Windows");
		
	}
	
	public List<String> getProductCategories()
	{
		List<String> categories = new ArrayList<>();
		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("Computers");
		return categories;
		
	}
	
	public List<String> getProducts(String category)
	{
		switch( category.toLowerCase())
		{
		case "books" :
			return bookList;
		case "music" :
			return musicList;
		case "movies" :
			return movieList;
		case "computers" :
			return computerList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product)
	{
		switch( category.toLowerCase())
		{
		case "books" :
			bookList.add(product);
			break;
		case "music" :
			musicList.add(product);
			break;
		case "movies" :
			movieList.add(product);
			break;
		case "computers" :
			computerList.add(product);
			break;
		default:
			return false;
			
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Book1", "1223ad",99.99));
		productList.add(new Product("Book2", "1244ad",120.99));		
		return productList;
	}
	
}
