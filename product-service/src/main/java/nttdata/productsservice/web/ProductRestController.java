package nttdata.productsservice.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nttdata.com.productservice.entities.Product;
import nttdata.productsservice.dtos.PurchaseDTO;
import nttdata.productsservice.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	private ProductService productService;
	
	ProductRestController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping(path="/products")
	public List<Product> findAll(){
		return this.productService.findAll();
	}
	
	@GetMapping(path="/products/{id}")
	//@PathVariable c'est pour faire le matching entre le variable 
	// dans l'URL et le var dans les param du method
	public Product getProduct(@PathVariable(name="id") String code){
		return this.productService.findById(code);
	}
	
	//@requestBody c'est pour dire que le variable product vient 
	//dans le corps de la requete est en format JSON
	@PostMapping(path="/products")
	public Product save(@RequestBody Product product){
		return this.productService.save(product);
	}
	
	@PutMapping(path="/products/{id}")
	public Product update(@PathVariable(name="id") String id, @RequestBody Product product){
		return this.productService.update(id,product);
	}
	
	@DeleteMapping(path="/products/{id}")
	public void delete(@PathVariable(name="id") String code){
		this.productService.deleteById(code);
	}

	@GetMapping(path="/products/checkQuatity/{id}")
	public boolean checkQuatity(@PathVariable(name="id") String id){
		return this.productService.checkAvability(id);
	}
	
//	@PutMapping(path="/products/purchase")
//	public ProductDTO purchase(@RequestBody PurchaseDTO dto){
//		return this.productService.purchase(dto);
//	}
//	

}
