package com.saugat.oms.controller;

import com.saugat.oms.dto.UserDetailDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userDetail")
public class UserDetailController extends AbstractController<UserDetailDto, Long>{
    private final IService<UserDetailDto, Long> service;

    public UserDetailController(IService<UserDetailDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<UserDetailDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "UserDetail";
    }
}
