package com.saugat.oms.service;

import com.saugat.oms.dto.UserRoleDto;
import com.saugat.oms.entity.UserRole;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService extends AbstractService<UserRole, UserRoleDto, Long> {

    private final IBaseRepository<UserRole, Long> repository;
    private final IBaseMapper<UserRole, UserRoleDto> mapper;

    public UserRoleService(IBaseRepository<UserRole, Long> repository, IBaseMapper<UserRole, UserRoleDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "UserRole";
    }

    @Override
    public IBaseRepository<UserRole, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<UserRole, UserRoleDto> getMapper() {
        return mapper;
    }
}
