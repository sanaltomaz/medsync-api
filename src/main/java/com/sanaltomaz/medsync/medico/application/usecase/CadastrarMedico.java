package com.sanaltomaz.medsync.medico.application.usecase;

import com.sanaltomaz.medsync.medico.application.dto.request.DadosCadastroMedico;
import com.sanaltomaz.medsync.medico.application.dto.response.DadosDetalhesMedico;
import com.sanaltomaz.medsync.medico.domain.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarMedico {

    private MedicoRepository medicoRepository;

    public DadosDetalhesMedico cadastrarMedico(DadosCadastroMedico dadosMedico) {
        System.out.println("Cadastrando Medico");
        return new DadosDetalhesMedico();
    }

}
