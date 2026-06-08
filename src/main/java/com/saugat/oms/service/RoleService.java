package com.saugat.oms.service;

import com.saugat.oms.dto.RoleDto;
import com.saugat.oms.entity.Role;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, RoleDto, Long> {
    private final IBaseRepository<Role, Long> repository;
    private final IBaseMapper<Role, RoleDto> mapper;

    public RoleService(IBaseRepository<Role, Long> repository, IBaseMapper<Role, RoleDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Role";
    }

    @Override
    public IBaseRepository<Role, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Role, RoleDto> getMapper() {
        return mapper;
    }
}
