package com.saugat.oms.service;

import com.saugat.oms.entity.Country;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.wrapper.CountryVo;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country, CountryVo, Long> {
    private final IBaseRepository<Country, Long> repository;
    private final IBaseMapper<Country, CountryVo> mapper;

    public CountryService(IBaseRepository<Country, Long> repository, IBaseMapper<Country, CountryVo> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Country";
    }

    @Override
    public IBaseRepository<Country, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Country, CountryVo> getMapper() {
        return mapper;
    }
}
