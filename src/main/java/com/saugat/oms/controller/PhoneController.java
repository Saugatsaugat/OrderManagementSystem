package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.wrapper.PhoneVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/phone")
public class PhoneController extends AbstractController<PhoneVo, Long> {

    private final IService<PhoneVo, Long> service;

    public PhoneController(IService<PhoneVo, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<PhoneVo, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Phone";
    }
}
