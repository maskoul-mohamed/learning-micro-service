package nttdata.com.productservice.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nttdata.com.productservice.enums.Category;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
	@Id
	private String id;
	private String label;
	private Double price;
	private Integer qte;
	@Enumerated(EnumType.STRING)
	private Category category;
}
