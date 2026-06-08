package com.saugat.oms.service;

import com.saugat.oms.dto.UserPhoneDto;
import com.saugat.oms.entity.UserPhone;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UserPhoneService extends AbstractService<UserPhone, UserPhoneDto, Long>{
    private final IBaseRepository<UserPhone, Long> repository;
    private final IBaseMapper<UserPhone, UserPhoneDto> mapper;

    public UserPhoneService(IBaseRepository<UserPhone, Long> repository, IBaseMapper<UserPhone, UserPhoneDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "";
    }

    @Override
    public IBaseRepository<UserPhone, Long> getRepository() {
        return null;
    }

    @Override
    public IBaseMapper<UserPhone, UserPhoneDto> getMapper() {
        return null;
    }
}
