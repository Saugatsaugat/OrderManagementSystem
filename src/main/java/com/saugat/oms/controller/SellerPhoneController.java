package com.saugat.oms.controller;

import com.saugat.oms.dto.SellerPhoneDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sellerPhone")
public class SellerPhoneController extends AbstractController<SellerPhoneDto, Long>{
    private final IService<SellerPhoneDto, Long> service;

    public SellerPhoneController(IService<SellerPhoneDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<SellerPhoneDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "SellerPhone";
    }
}
