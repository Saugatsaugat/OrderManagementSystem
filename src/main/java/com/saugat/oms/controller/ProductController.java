package com.saugat.oms.controller;

import com.saugat.oms.dto.ProductDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController extends AbstractController<ProductDto, Long>{
    private final IService<ProductDto, Long> service;

    public ProductController(IService<ProductDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<ProductDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Product";
    }
}
