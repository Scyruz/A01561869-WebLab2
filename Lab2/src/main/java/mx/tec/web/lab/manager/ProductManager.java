/**
 * 
 */
package mx.tec.web.lab.manager;


import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.web.lab.entity.Product;
import mx.tec.web.lab.repository.ProductRepository;


/**
 * @author Scyruz
 *
 */

@Service
public class ProductManager 
{
	@Resource
	ProductRepository productRepository;
	
	/**
	 * Retrieve all the products
	 * @Return List of products
	 *
	 */
	public List<Product> getProducts() 
	{
		return productRepository.findAll();
	}
	
	
	/**
	 * Retrieve an specific product based on a given product id
	 * @param id Product id
	 * @Return Optional containing a product if the product was found or empty otherwise
	 *
	 */
	public Optional<Product> getProduct(final long id) 
	{
		Optional<Product> foundProduct = productRepository.findById(id);
		
		return foundProduct;		
	}
	
	
	/**
	 * Add a new Product to the product list based on a given product
	 * @param newProdcut product to add
	 * @Return An Optional containing the new product
	 *
	 */
//	public Optional<Product> addProduct(final Product newProduct) 
//	{
//		products.add(newProduct);
//		
//		return Optional.of(newProduct);
//	}
	
	
	/**
	 * Delete the product based on a given product
	 * @param existingProduct The product to delete
	 *
	 */
//	public void deleteProduct(final Product existingProduct)
//	{
//		products.remove(existingProduct);
//	}
	
	/**
	 * Update an existing product based on a given modified product and a product id
	 * @param id The product id for the original product
	 * @Return modifiedProduct The product's new version
	 *
	 */
//	public void updateProduct(final String id, final mx.tec.web.lab.entity.Product modifiedProduct)
//	{
//		final Optional<Product> existingProduct = getProduct(id);
//		
//		if (existingProduct.isPresent()) 
//		{
//			final Product product = existingProduct.get();
//			product.setId(modifiedProduct.getId());
//			product.setName(modifiedProduct.getName());
//			product.setDescription(modifiedProduct.getDescription());
//			product.setChildSkus(modifiedProduct.getChildSkus());
//		}
//	}
}
