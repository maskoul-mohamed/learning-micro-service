package nttdata.com.productservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import nttdata.com.productservice.entities.Product;
import nttdata.com.productservice.enums.Category;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, String>{
	@RestResource(path="/byCategory")
	List<Product> findByCategory(@Param(value="category") Category category);
}
