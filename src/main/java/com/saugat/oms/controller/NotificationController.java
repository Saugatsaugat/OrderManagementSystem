package com.saugat.oms.controller;

import com.saugat.oms.dto.NotificationDto;
import com.saugat.oms.service.IService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController extends AbstractController<NotificationDto, Long>{
    private static final Logger log = LogManager.getLogger(NotificationController.class);
    private IService<NotificationDto, Long> service;


    public NotificationController(IService<NotificationDto, Long> service) {
        this.service = service;
    }

    @Override
    protected IService<NotificationDto, Long> getService() {
        return service;
    }

    @Override
    protected String getResourceName() {
        return "Notification";
    }
}
