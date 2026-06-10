package com.saugat.oms.repository;

import com.saugat.oms.entity.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends IBaseRepository<OrderDetail, Long> {
}
