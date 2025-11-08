package com.example.JPATuts_2;

import com.example.JPATuts_2.Entity.ProductEntity;
import com.example.JPATuts_2.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;


@SpringBootTest
class JpaTuts2ApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository() {
		ProductEntity productEntity = ProductEntity.builder()
				.sku("nestle234")
				.title("Nestle Chocolate")
				.price(BigDecimal.valueOf(23.45))
				.quantity(4)
				.build();

		ProductEntity savedProductEntity = productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}


	@Test
	void getSingleFromRepository() {
		Optional<ProductEntity> productEntity = productRepository
				.findByTitleAndPrice("Pepsi", BigDecimal.valueOf(14.4));
		productEntity.ifPresent(System.out::println);
	}

}
