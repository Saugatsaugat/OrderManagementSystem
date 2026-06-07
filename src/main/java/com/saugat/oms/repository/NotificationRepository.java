package com.saugat.oms.repository;

import com.saugat.oms.entity.Notification;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends IBaseRepository<Notification, Long> {
}
