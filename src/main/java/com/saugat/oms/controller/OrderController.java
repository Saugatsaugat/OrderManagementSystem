package com.saugat.oms.controller;

import com.saugat.oms.dto.OrderDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController extends AbstractController<OrderDto, Long>{
    private final IService<OrderDto, Long> service;

    public OrderController(IService<OrderDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<OrderDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Order";
    }
}
