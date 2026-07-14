package com.saugat.oms.service;

import com.saugat.oms.dto.OrderDetailDto;
import com.saugat.oms.entity.OrderDetail;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService extends AbstractService<OrderDetail, OrderDetailDto, Long> {
    private final IBaseRepository<OrderDetail, Long> repository;
    private final IBaseMapper<OrderDetail, OrderDetailDto> mapper;

    public OrderDetailService(IBaseRepository<OrderDetail, Long> repository, IBaseMapper<OrderDetail, OrderDetailDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "OrderDetail";
    }

    @Override
    public IBaseRepository<OrderDetail, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<OrderDetail, OrderDetailDto> getMapper() {
        return mapper;
    }
}
