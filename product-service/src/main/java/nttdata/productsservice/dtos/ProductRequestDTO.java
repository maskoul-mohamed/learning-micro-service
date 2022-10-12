package nttdata.productsservice.dtos;


import lombok.Builder;
import lombok.Data;
import nttdata.com.productservice.enums.Category;

@Data
@Builder
public class ProductRequestDTO {
	private String id;
	private String label;
	private double price;
	private int qte;
	private Category category;
}
