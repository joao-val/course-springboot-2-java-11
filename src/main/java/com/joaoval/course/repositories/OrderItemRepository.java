package com.joaoval.course.repositories;

import com.joaoval.course.entities.OrderItem;
import com.joaoval.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
