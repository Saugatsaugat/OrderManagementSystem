package com.saugat.oms.repo;

import com.saugat.oms.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends IBaseRepo<User, Long> {
}