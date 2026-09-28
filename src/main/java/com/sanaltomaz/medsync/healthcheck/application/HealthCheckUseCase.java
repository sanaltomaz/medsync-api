package com.sanaltomaz.medsync.healthcheck.application;

import com.sanaltomaz.medsync.healthcheck.domain.HealthStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckUseCase {

    private static final String SERVICE_NAME = "medsync-api";

    public HealthStatus execute() {
        return HealthStatus.up(SERVICE_NAME);
    }
}
