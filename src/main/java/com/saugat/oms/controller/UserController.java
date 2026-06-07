package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends AbstractController<UserDto, Long> {

    private final IService<UserDto, Long> service;
    public UserController(IService<UserDto, Long> service){
        this.service = service;
    }

    @Override
    protected IService<UserDto, Long> getService() {
        return this.service;
    }

    @Override
    public String getResourceName() {
        return "User";
    }
}
