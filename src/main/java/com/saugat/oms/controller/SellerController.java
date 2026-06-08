package com.saugat.oms.controller;

import com.saugat.oms.dto.SellerDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seller")
public class SellerController extends AbstractController<SellerDto, Long>{
    private final IService<SellerDto, Long> service;

    public SellerController(IService<SellerDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<SellerDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Seller";
    }
}
