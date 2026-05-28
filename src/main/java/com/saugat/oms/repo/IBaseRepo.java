package com.saugat.oms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepo<E, ID> extends JpaRepository<E, ID> {
}