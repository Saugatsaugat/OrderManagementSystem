package com.saugat.oms.repository;

import com.saugat.oms.entity.Cart;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends IBaseRepository<Cart, Long> {
}
