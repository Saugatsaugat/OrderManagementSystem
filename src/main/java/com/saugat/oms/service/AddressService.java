package com.saugat.oms.service;

import com.saugat.oms.entity.Address;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.wrapper.AddressVo;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends AbstractService<Address, AddressVo, Long> {

    private final IBaseRepository<Address, Long> repo;
    private final IBaseMapper<Address, AddressVo> mapper;

    public AddressService(IBaseRepository<Address, Long> repo, IBaseMapper<Address, AddressVo> mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Address";
    }

    @Override
    public IBaseRepository<Address, Long> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Address, AddressVo> getMapper() {
        return mapper;
    }
}
