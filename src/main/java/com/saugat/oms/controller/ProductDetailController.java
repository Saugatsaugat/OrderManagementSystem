package com.saugat.oms.controller;

import com.saugat.oms.dto.ProductDetailDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productDetail")
public class ProductDetailController extends AbstractController<ProductDetailDto, Long>{
    private final IService<ProductDetailDto, Long> service;

    public ProductDetailController(IService<ProductDetailDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<ProductDetailDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "ProductDetail";
    }
}
