package com.saugat.oms.service;

import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.entity.User;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserDto, Long> {

    private final IBaseRepository<User, Long> repo;
    private final IBaseMapper<User, UserDto> mapper;
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserService(IBaseRepository<User, Long> repo, IBaseMapper<User, UserDto> mapper){
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName(){
        return "User";
    }

    @Override
    public IBaseRepository<User, Long> getRepository() {
        return this.repo;
    }

    @Override
    public IBaseMapper<User, UserDto> getMapper() {
        return this.mapper;
    }


}