package com.sanaltomaz.medsync.healthcheck.domain;

import java.time.LocalDateTime;

public record HealthStatus(
    String status,
    LocalDateTime timestamp,
    String serviceName
) {
    public static HealthStatus up(String serviceName) {
        return new HealthStatus("UP", LocalDateTime.now(), serviceName);
    }
}
