package org.library.backend.repositories;

import org.library.backend.dto.ProductListDTO;
import org.library.backend.models.Product;
import org.library.backend.util.constants.ProductType;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<ProductListDTO> findByType(ProductType type, Pageable pageable);

}