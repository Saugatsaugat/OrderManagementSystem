package com.saugat.oms.service;

import com.saugat.oms.dto.SellerPhoneDto;
import com.saugat.oms.entity.SellerPhone;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerPhoneService extends AbstractService<SellerPhone, SellerPhoneDto, Long> {
    private final IBaseRepository<SellerPhone, Long> repository;
    private final IBaseMapper<SellerPhone, SellerPhoneDto> mapper;

    public SellerPhoneService(IBaseRepository<SellerPhone, Long> repository, IBaseMapper<SellerPhone, SellerPhoneDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "SellerPhone";
    }

    @Override
    public IBaseRepository<SellerPhone, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<SellerPhone, SellerPhoneDto> getMapper() {
        return mapper;
    }
}
