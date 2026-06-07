package com.saugat.oms.service;

import com.saugat.oms.entity.Country;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import com.saugat.oms.dto.CountryDto;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country, CountryDto, Long> {
    private final IBaseRepository<Country, Long> repository;
    private final IBaseMapper<Country, CountryDto> mapper;

    public CountryService(IBaseRepository<Country, Long> repository, IBaseMapper<Country, CountryDto> mapper) {
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
    public IBaseMapper<Country, CountryDto> getMapper() {
        return mapper;
    }
}
