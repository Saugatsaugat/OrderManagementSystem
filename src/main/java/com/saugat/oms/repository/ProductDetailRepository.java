package com.saugat.oms.repository;

import com.saugat.oms.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends IBaseRepository<Product, Long> {
}
