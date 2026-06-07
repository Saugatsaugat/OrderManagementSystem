package com.saugat.oms.controller;

import com.saugat.oms.dto.CategoryDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController extends AbstractController<CategoryDto, Long>{
    private final IService<CategoryDto, Long> service;

    public CategoryController(IService<CategoryDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<CategoryDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Category";
    }
}
