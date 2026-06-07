package com.saugat.oms.service;

import com.saugat.oms.entity.Phone;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.dto.PhoneDto;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends AbstractService<Phone, PhoneDto, Long> {

    private final IBaseRepository<Phone, Long> repository;
    private final IBaseMapper<Phone, PhoneDto> mapper;

    public PhoneService(IBaseRepository<Phone, Long> repository, IBaseMapper<Phone, PhoneDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Phone";
    }

    @Override
    public IBaseRepository<Phone, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Phone, PhoneDto> getMapper() {
        return mapper;
    }
}
