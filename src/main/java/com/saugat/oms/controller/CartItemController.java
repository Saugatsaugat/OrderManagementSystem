package com.saugat.oms.controller;

import com.saugat.oms.dto.CartItemDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cartItem")
public class CartItemController extends AbstractController<CartItemDto, Long> {
    private final IService<CartItemDto, Long> service;

    public CartItemController(IService<CartItemDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<CartItemDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "CartItem";
    }
}
