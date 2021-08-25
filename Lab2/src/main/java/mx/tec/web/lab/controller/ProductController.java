/**
 * 
 */
package mx.tec.web.lab.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.web.lab.entity.Product;
import mx.tec.web.lab.manager.ProductManager;

/**
 * @author Scyruz
 *
 */

@RestController
public class ProductController 
{
	/**
	 * A reference to the Product Manager
	 */
	@Resource
	private ProductManager productManager;
	
	/**
	 * The endpoint for GET{url}/products
	 * @return A JSON list of all the products
	 */
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() 
	{
		List<Product> products = productManager.getProducts();
		ResponseEntity<List<Product>> responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		
		return responseEntity;
	}
	
	/**
	 * The endpoint for GET{url}/products/{id}
	 * @param id Product id
	 * @return A JSON containing the product's info and status 200 if the product is found or status 404 if not found
	 */
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable(value = "id") long id) 
	{
	ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
	
	Optional<Product> product = productManager.getProduct(id);
	
	if (product.isPresent()) 
		{
		responseEntity = new ResponseEntity<>(product.get(), HttpStatus.OK);
		}
	
	return responseEntity;
	}
	
	/**
	 * The endpoint for POST{url}/products
	 * @param newProduct a JSON containing the info for the new product
	 * @return If the product is created successfully then 201 and the product info is returned, otherwise it returns
	 */
//	@PostMapping("/products")
//	public ResponseEntity<Product> addProduct(@RequestBody Product newProduct) 
//	{
//		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		
//		Optional<Product> product = productManager.addProduct(newProduct);
//		
//		if (product.isPresent()) 
//			{
//			responseEntity = new ResponseEntity<>(product.get(), HttpStatus.CREATED);
//			}
//		
//		return responseEntity;
//
//	}
	
	/**
	 * The endpoint for PUT {url}/products/{id}
	 * @param id Product id
	 * @param modifiedProduct a JSON containing the info for the modified product
	 * @return status 200 if the product is found and updated or status 204 if the product is not found
	 */
//	@PutMapping("/products/{id}")
//	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") String id, @RequestBody Product modifiedProduct)
//	{
//		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		Optional<Product> product = productManager.getProduct(id);
//		
//		if (product.isPresent())
//		{
//			productManager.updateProduct(id, modifiedProduct);
//			responseEntity = new ResponseEntity<>(HttpStatus.OK);
//		}
//		
//		return responseEntity;
//	}
	
	/**
	 * The endpoint for DELETE{url}/products/{id}
	 * @param id Product id
	 * @return status 200 if the product is found and deleted or status 204 if the product is not found
	 */
	
//	@DeleteMapping("/products/{id}")
//	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") String id)
//	{
//		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		Optional<Product> product = productManager.getProduct(id);
//		
//		if (product.isPresent())
//		{
//			productManager.deleteProduct(product.get());
//			responseEntity = new ResponseEntity<>(HttpStatus.OK);
//		}
//		
//		return responseEntity;
//	}
	
	
}
