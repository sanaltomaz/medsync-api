package com.sanaltomaz.medsync.medico.application.dto.response;


import com.sanaltomaz.medsync.medico.domain.Especialidade;
import com.sanaltomaz.medsync.shared.domain.Endereco;

public record DadosDetalhesMedico(
        Long id,
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Endereco endereco
) {
    public DadosDetalhesMedico() {
        this(
                0L,
                "",
                "",
                "",
                "",
                Especialidade.CARDIOLOGIA,
                new Endereco()
        );
    }
}
