package com.example.JPATut_3.Repository;

import com.example.JPATut_3.Entity.ProductEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
//below should be interface
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByTitleAndPrice(String peps, BigDecimal bigDecimal);

    List<ProductEntity> findByTitleOrderByPrice(String pepsi);

    List<ProductEntity> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    //List<ProductEntity> findByTitle(String title);
}
