package com.sanaltomaz.medsync.healthcheck.infrastructure.controller;

import com.sanaltomaz.medsync.healthcheck.application.HealthCheckUseCase;
import com.sanaltomaz.medsync.healthcheck.domain.HealthStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    private final HealthCheckUseCase healthCheckUseCase;

    public HealthCheckController(HealthCheckUseCase healthCheckUseCase) {
        this.healthCheckUseCase = healthCheckUseCase;
    }

    @GetMapping
    public ResponseEntity<HealthStatus> check() {
        return ResponseEntity.ok(healthCheckUseCase.execute());
    }
}
