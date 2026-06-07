package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.wrapper.CountryVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController extends AbstractController<CountryVo, Long>{
    private final IService<CountryVo, Long> service;

    public CountryController(IService<CountryVo, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<CountryVo, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Country";
    }
}
