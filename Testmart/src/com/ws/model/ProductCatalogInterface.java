package com.ws.model;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="ProductCatalog", portName="TestMartCatalogPort", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();
 
	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	public abstract List<Product> getProductsv2(String category);

}