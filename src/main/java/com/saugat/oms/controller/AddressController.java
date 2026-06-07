package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.dto.AddressDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController extends AbstractController<AddressDto, Long> {
    private final IService<AddressDto, Long> service;

    public AddressController(IService<AddressDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<AddressDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Address";
    }
}
