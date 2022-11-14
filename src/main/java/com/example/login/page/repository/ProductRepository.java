package com.example.login.page.repository;

import com.example.login.page.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDetails,Integer> {
}
