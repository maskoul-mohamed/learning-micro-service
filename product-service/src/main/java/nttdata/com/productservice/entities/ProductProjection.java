package nttdata.com.productservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class, name="p1")
public interface ProductProjection {
	public String getLabel();
	public Double getPrice();
}
