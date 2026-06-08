package com.saugat.oms.service;

import com.saugat.oms.dto.SellerDto;
import com.saugat.oms.entity.Seller;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerService extends AbstractService<Seller, SellerDto, Long> {
    private final IBaseMapper<Seller, SellerDto> mapper;
    private final IBaseRepository<Seller, Long> repository;

    public SellerService(IBaseMapper<Seller, SellerDto> mapper, IBaseRepository<Seller, Long> repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public String getServiceName() {
        return "Seller";
    }

    @Override
    public IBaseRepository<Seller, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Seller, SellerDto> getMapper() {
        return mapper;
    }
}
