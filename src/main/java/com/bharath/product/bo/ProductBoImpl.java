package com.bharath.product.bo;

import com.bharath.product.dao.ProductDAO;
import com.bharath.product.dao.ProductDAOImpl;
import com.bharath.product.dto.Product;

public class ProductBoImpl implements ProductBO {
     
	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
			dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
