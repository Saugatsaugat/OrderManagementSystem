package com.saugat.oms.service;

import com.saugat.oms.dto.OrderDto;
import com.saugat.oms.entity.Order;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractService<Order, OrderDto, Long> {
    private final IBaseRepository<Order, Long> repository;
    private final IBaseMapper<Order, OrderDto> mapper;

    public OrderService(IBaseRepository<Order, Long> repository, IBaseMapper<Order, OrderDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Order";
    }

    @Override
    public IBaseRepository<Order, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Order, OrderDto> getMapper() {
        return mapper;
    }
}
