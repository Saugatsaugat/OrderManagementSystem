package com.saugat.oms.service;

import com.saugat.oms.entity.Phone;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.wrapper.PhoneVo;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends AbstractService<Phone, PhoneVo, Long> {

    private IBaseRepository<Phone, Long> repository;
    private IBaseMapper<Phone, PhoneVo> mapper;

    public PhoneService(IBaseRepository<Phone, Long> repository, IBaseMapper<Phone, PhoneVo> mapper) {
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
    public IBaseMapper<Phone, PhoneVo> getMapper() {
        return mapper;
    }
}
