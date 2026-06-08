package com.saugat.oms.controller;

import com.saugat.oms.dto.UserPhoneDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userPhone")
public class UserPhoneController extends AbstractController<UserPhoneDto, Long>{
    private IService<UserPhoneDto, Long> service;

    public UserPhoneController(IService<UserPhoneDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<UserPhoneDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "UserPhone";
    }
}
