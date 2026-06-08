package com.saugat.oms.repository;

import com.saugat.oms.entity.CartItem;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends IBaseRepository<CartItem, Long> {
}
