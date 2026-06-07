package com.saugat.oms.repository;

import com.saugat.oms.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends IBaseRepository<Address, Long> {
}
