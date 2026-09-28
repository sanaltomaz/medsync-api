package com.sanaltomaz.medsync.healthcheck.application;

import com.sanaltomaz.medsync.healthcheck.domain.HealthStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HealthCheckUseCaseTest {

    @Test
    void shouldExecuteAndReturnUpHealthStatus() {
        HealthCheckUseCase useCase = new HealthCheckUseCase();

        HealthStatus result = useCase.execute();

        assertNotNull(result);
        assertEquals("UP", result.status());
        assertEquals("medsync-api", result.serviceName());
        assertNotNull(result.timestamp());
    }
}
