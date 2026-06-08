package com.saugat.oms.service;

import com.saugat.oms.dto.CartDto;
import com.saugat.oms.entity.Cart;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService extends AbstractService<Cart, CartDto, Long> {
    private final IBaseRepository<Cart, Long> repository;
    private final IBaseMapper<Cart, CartDto> mapper;

    public CartService(IBaseRepository<Cart, Long> repository, IBaseMapper<Cart, CartDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Cart";
    }

    @Override
    public IBaseRepository<Cart, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Cart, CartDto> getMapper() {
        return mapper;
    }
}
