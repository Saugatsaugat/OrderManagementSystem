package com.saugat.oms.service;

import com.saugat.oms.controller.SellerDetail;
import com.saugat.oms.dto.SellerDetailDto;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerDetailService extends AbstractService<SellerDetail, SellerDetailDto, Long>{
    private final IBaseMapper<SellerDetail, SellerDetailDto> mapper;
    private final IBaseRepository<SellerDetail, Long> repository;

    public SellerDetailService(IBaseMapper<SellerDetail, SellerDetailDto> mapper, IBaseRepository<SellerDetail, Long> repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public String getServiceName() {
        return "SellerDetail";
    }

    @Override
    public IBaseRepository<SellerDetail, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<SellerDetail, SellerDetailDto> getMapper() {
        return mapper;
    }
}
