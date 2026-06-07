package com.saugat.oms.service;

import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.entity.User;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.wrapper.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserVo, Long> {

    private final IBaseRepository<User, Long> repo;
    private final IBaseMapper<User, UserVo> mapper;
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserService(IBaseRepository<User, Long> repo, IBaseMapper<User, UserVo> mapper){
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
    public IBaseMapper<User, UserVo> getMapper() {
        return this.mapper;
    }


}