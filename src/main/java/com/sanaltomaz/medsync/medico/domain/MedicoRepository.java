package com.sanaltomaz.medsync.medico.domain;

import java.util.Optional;

public interface MedicoRepository {
    Medico save(Medico medico);
    Optional<Medico> findById(Long id);
}
