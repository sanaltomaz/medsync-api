package com.sanaltomaz.medsync.medico.domain;

import com.sanaltomaz.medsync.shared.domain.Endereco;
import lombok.Data;

@Data
public class Medico {
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String crm;

    private Especialidade especialidade;
    private Endereco endereco;

    private boolean ativo;
}
