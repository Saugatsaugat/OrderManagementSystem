package com.saugat.oms.service;

import com.saugat.oms.dto.CategoryDto;
import com.saugat.oms.entity.Category;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractService<Category, CategoryDto, Long> {
    private final IBaseRepository<Category, Long> repository;
    private final IBaseMapper<Category, CategoryDto> mapper;

    public CategoryService(IBaseRepository<Category, Long> repository, IBaseMapper<Category, CategoryDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Category";
    }

    @Override
    public IBaseRepository<Category, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Category, CategoryDto> getMapper() {
        return mapper;
    }
}
