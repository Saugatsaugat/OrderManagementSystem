package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.wrapper.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends AbstractController<UserVo, Long> {

    private final IService<UserVo, Long> service;
    public UserController(IService<UserVo, Long> service){
        this.service = service;
    }

    @Override
    protected IService<UserVo, Long> getService() {
        return this.service;
    }

    @Override
    public String getResourceName() {
        return "User";
    }
}
