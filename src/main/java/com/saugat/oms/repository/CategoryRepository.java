package com.saugat.oms.repository;

import com.saugat.oms.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends IBaseRepository<Category, Long> {
}
