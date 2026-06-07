package com.saugat.oms.mapper;

import com.saugat.oms.dto.NotificationDto;
import com.saugat.oms.entity.Notification;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class NotificationMapper implements IBaseMapper<Notification, NotificationDto> {
}
