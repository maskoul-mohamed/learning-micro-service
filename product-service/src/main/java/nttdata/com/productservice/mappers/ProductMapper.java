package nttdata.com.productservice.mappers;

import nttdata.com.productservice.entities.Product;
import nttdata.productsservice.dtos.ProductRequestDTO;


public interface ProductMapper {
	Product productRequestDtoToProduct(ProductRequestDTO dto);
}
