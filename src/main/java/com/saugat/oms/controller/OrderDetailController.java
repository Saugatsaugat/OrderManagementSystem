package com.saugat.oms.controller;

import com.saugat.oms.dto.OrderDetailDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orderDetail")
public class OrderDetailController extends AbstractController<OrderDetailDto, Long>{
    private final IService<OrderDetailDto, Long> service;

    public OrderDetailController(IService<OrderDetailDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<OrderDetailDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "OrderDetail";
    }
}
