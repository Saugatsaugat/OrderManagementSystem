package com.saugat.oms.service;

import com.saugat.oms.dto.ProductDetailDto;
import com.saugat.oms.entity.ProductDetail;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailService extends AbstractService<ProductDetail, ProductDetailDto, Long> {
    private final IBaseRepository<ProductDetail, Long> repository;
    private final IBaseMapper<ProductDetail, ProductDetailDto> mapper;

    public ProductDetailService(IBaseRepository<ProductDetail, Long> repository, IBaseMapper<ProductDetail, ProductDetailDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "ProductDetail";
    }

    @Override
    public IBaseRepository<ProductDetail, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<ProductDetail, ProductDetailDto> getMapper() {
        return mapper;
    }
}
