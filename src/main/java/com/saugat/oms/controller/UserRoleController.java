package com.saugat.oms.controller;

import com.saugat.oms.dto.UserRoleDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userRole")
public class UserRoleController extends AbstractController<UserRoleDto, Long> {

    private final IService<UserRoleDto, Long> service;

    public UserRoleController(IService<UserRoleDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<UserRoleDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "UserRole";
    }
}
