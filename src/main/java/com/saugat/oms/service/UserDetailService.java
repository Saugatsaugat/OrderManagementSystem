package com.saugat.oms.service;

import com.saugat.oms.dto.UserDetailDto;
import com.saugat.oms.entity.UserDetail;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService extends AbstractService<UserDetail, UserDetailDto, Long>{
    private final IBaseRepository<UserDetail, Long> repository;
    private final IBaseMapper<UserDetail, UserDetailDto> mapper;

    public UserDetailService(IBaseRepository<UserDetail, Long> repository, IBaseMapper<UserDetail, UserDetailDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "UserDetail";
    }

    @Override
    public IBaseRepository<UserDetail, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<UserDetail, UserDetailDto> getMapper() {
        return mapper;
    }
}
