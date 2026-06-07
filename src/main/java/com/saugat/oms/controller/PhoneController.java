package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.dto.PhoneDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/phone")
public class PhoneController extends AbstractController<PhoneDto, Long> {

    private final IService<PhoneDto, Long> service;

    public PhoneController(IService<PhoneDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<PhoneDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Phone";
    }
}
