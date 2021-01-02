package com.github.kadehar.payroll.repository;

import com.github.kadehar.payroll.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
