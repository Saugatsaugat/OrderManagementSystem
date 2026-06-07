package com.saugat.oms.service;

import com.saugat.oms.dto.NotificationDto;
import com.saugat.oms.entity.Notification;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.repository.IBaseRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService extends AbstractService<Notification, NotificationDto, Long> {
    private final IBaseRepository<Notification, Long> repository;
    private final IBaseMapper<Notification, NotificationDto> mapper;

    public NotificationService(IBaseRepository<Notification, Long> repository, IBaseMapper<Notification, NotificationDto> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getServiceName() {
        return "Notification";
    }

    @Override
    public IBaseRepository<Notification, Long> getRepository() {
        return repository;
    }

    @Override
    public IBaseMapper<Notification, NotificationDto> getMapper() {
        return mapper;
    }
}
