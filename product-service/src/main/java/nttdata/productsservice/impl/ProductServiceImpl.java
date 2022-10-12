package nttdata.productsservice.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import nttdata.com.productservice.entities.Product;
import nttdata.com.productservice.repositories.ProductRepository;
import nttdata.productsservice.dtos.ProductRequestDTO;
import nttdata.productsservice.dtos.PurchaseDTO;
import nttdata.productsservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> findAll() {
		System.out.println("Fetch list of products");
		return productRepository.findAll();
	}

	public Product findById(String id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException(String.format("Product %d not exist", id)));
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(String id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkAvability(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductRequestDTO purchase(PurchaseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

//	public Product update(String id, Product product) {
//		Product savedProduct = findById(id);
//		if (product.getCategory() != null)
//			savedProduct.setCategory(product.getCategory());
//		if (product.getLabel() != null)
//			savedProduct.setLabel(product.getLabel());
//		if (product.getPrice() != null)
//			savedProduct.setPrice(product.getPrice());
//		if (product.getQte() != null)
//			savedProduct.setQte(product.getQte());
//		return productRepository.save(savedProduct);
//	}
//
//	public void deleteById(String id) {
//		productRepository.deleteById(id);
//	}
//
//	@Override
//	public boolean checkAvability(String id) {
//		Product product = this.findById(id);
//		return product.getQte()>0;
//	}
//
//	@Override
//	public ProductRequestDTO purchase(PurchaseDTO dto) {
//		Product product = this.findById(dto.getId());
//		product.setQte(product.getQte()+dto.getQte());
//		
//		Product savedProduct = this.update(dto.getId(),product);
//		productDto productDto = ProductDTO.builder()
//				.category(savedProduct.getCategory())
//				.label(savedProduct.getLabel())
//				.price(savedProduct.getPrice())
//				.qte(savedProduct.getQte())
//				.build();
//		return productDto;
//	}
}
