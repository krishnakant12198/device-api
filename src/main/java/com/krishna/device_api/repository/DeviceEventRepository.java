package com.krishna.device_api.repository;

import com.krishna.device_api.entity.DeviceEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceEventRepository extends JpaRepository<DeviceEvent, Long> {
}
