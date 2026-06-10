package com.saugat.oms.repository;

import com.saugat.oms.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends IBaseRepository<Order, Long> {
}
