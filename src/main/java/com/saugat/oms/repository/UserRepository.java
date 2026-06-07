package com.saugat.oms.repository;

import com.saugat.oms.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends IBaseRepository<User, Long> {
}