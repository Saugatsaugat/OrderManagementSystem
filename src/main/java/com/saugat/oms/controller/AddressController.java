package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.wrapper.AddressVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController extends AbstractController<AddressVo, Long> {
    private final IService<AddressVo, Long> service;

    public AddressController(IService<AddressVo, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<AddressVo, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Address";
    }
}
