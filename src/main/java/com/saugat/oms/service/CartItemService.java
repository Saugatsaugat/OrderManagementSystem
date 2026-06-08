package com.saugat.oms.service;

import com.saugat.oms.dto.CartItemDto;
import com.saugat.oms.entity.CartItem;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CartItemService extends AbstractService<CartItem, CartItemDto, Long> {
    private final IBaseRepository<CartItem, Long> repository;
    private final IBaseMapper<CartItem, CartItemDto> mapper;

    public CartItemService(IBaseRepository<CartItem, Long> repository, IBaseMapper<CartItem, CartItemDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "CartItem";
    }

    @Override
    public IBaseRepository<CartItem, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<CartItem, CartItemDto> getMapper() {
        return mapper;
    }
}
