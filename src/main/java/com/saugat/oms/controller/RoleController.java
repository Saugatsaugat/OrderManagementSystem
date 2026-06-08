package com.saugat.oms.controller;

import com.saugat.oms.dto.RoleDto;
import com.saugat.oms.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController extends AbstractController<RoleDto, Long>{
    private final IService<RoleDto, Long> service;

    public RoleController(IService<RoleDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<RoleDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Role";
    }
}
