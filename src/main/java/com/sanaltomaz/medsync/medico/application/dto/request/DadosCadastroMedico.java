package com.sanaltomaz.medsync.medico.application.dto.request;

import com.sanaltomaz.medsync.medico.domain.Especialidade;
import com.sanaltomaz.medsync.shared.application.dto.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
        @NotBlank
        String nome,

        @NotBlank
        String email,

        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotBlank
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco
) {

}
