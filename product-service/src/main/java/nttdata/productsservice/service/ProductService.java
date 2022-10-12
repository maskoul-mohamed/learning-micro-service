package nttdata.productsservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import nttdata.com.productservice.entities.Product;
import nttdata.productsservice.dtos.ProductRequestDTO;
import nttdata.productsservice.dtos.PurchaseDTO;

@Service
@Transactional
public interface ProductService {
	/**
	 * get all product that exist in product database
	 * @return List<Product>
	 */
	public List<Product> findAll();
	/**
	 * get product by id from product database
	 * @param id : String
	 * @return Product
	 */
	public Product findById(String id);
	/**
	 * add new product to database
	 * @param product : Product
	 * @return Product
	 */	
	public Product save(Product product);
	/**
	 * update data for a given product by id 
	 * @param id
	 * @param product
	 * @return Product
	 */
	public Product update(String id, Product product);

	/**
	 * delete product by id 
	 * @param id
	 */
	public void deleteById(String id);
	
	/**
	 * check the quatity existing in the stock
	 * @param id : String
	 * @return true in case that still exist else false
	 */
	public boolean checkAvability(String id);
	
	/**
	 * purchase new qte for an existing product
	 * @param dto
	 * @return ProductDTO
	 */
	public ProductRequestDTO purchase(PurchaseDTO dto);
}
