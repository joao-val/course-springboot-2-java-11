package com.joaoval.course.repositories;

import com.joaoval.course.entities.Category;
import com.joaoval.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
