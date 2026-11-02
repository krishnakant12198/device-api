package com.krishna.device_api.service;

import com.krishna.device_api.dto.DevicePayload;
import com.krishna.device_api.entity.DeviceEvent;

public interface DeviceEventService {
    DeviceEvent saveEvent(DevicePayload payload, String requestPath);
}
