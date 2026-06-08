package com.saugat.oms.controller;

import com.saugat.oms.dto.SellerDetailDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sellerDetail")
public class SellerDetailController extends AbstractController<SellerDetailDto, Long>{
    private final IService<SellerDetailDto, Long> service;

    public SellerDetailController(IService<SellerDetailDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<SellerDetailDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "SellerDetail";
    }
}
