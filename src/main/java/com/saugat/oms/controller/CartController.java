package com.saugat.oms.controller;

import com.saugat.oms.dto.CartDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController extends AbstractController<CartDto, Long> {
    private final IService<CartDto, Long> service;

    public CartController(IService<CartDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<CartDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Cart";
    }
}
