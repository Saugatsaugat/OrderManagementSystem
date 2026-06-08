package com.saugat.oms.service;

import com.saugat.oms.dto.ProductDto;
import com.saugat.oms.entity.Product;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractService<Product, ProductDto, Long> {
    private final IBaseRepository<Product, Long> repository;
    private final IBaseMapper<Product, ProductDto> mapper;

    public ProductService(IBaseRepository<Product, Long> repository, IBaseMapper<Product, ProductDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Product";
    }

    @Override
    public IBaseRepository<Product, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Product, ProductDto> getMapper() {
        return mapper;
    }
}
