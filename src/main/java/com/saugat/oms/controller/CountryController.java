package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.dto.CountryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController extends AbstractController<CountryDto, Long>{
    private final IService<CountryDto, Long> service;

    public CountryController(IService<CountryDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<CountryDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Country";
    }
}
