package com.sanaltomaz.medsync.medico.infrastructure.http;

import com.sanaltomaz.medsync.medico.application.usecase.CadastrarMedico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/medico")
public class MedicoController {

    @PostMapping
    public ResponseEntity<Void> cadastrarMedico() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
