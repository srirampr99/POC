package com.ws.model;

import java.util.List;

import javax.jws.WebService;

import com.ws.business.ProductServiceImpl;


@WebService(endpointInterface="com.ws.model.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.ws.model.ProductCatalogInterface#getProductCategories()
	 */
	@Override
		public List<String> getProductCategories()
	{
		return productServiceImpl.getProductCategories();
		
	}
	/* (non-Javadoc)
	 * @see com.ws.model.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category)
	{
		return productServiceImpl.getProducts(category);
		
	}
	/* (non-Javadoc)
	 * @see com.ws.model.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product)
	{
		return productServiceImpl.addProduct(category,product);
		
	}
	/* (non-Javadoc)
	 * @see com.ws.model.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category)
	{
		return productServiceImpl.getProductsv2(category);
		
	}
}
