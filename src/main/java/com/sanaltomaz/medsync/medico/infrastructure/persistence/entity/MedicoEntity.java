package com.sanaltomaz.medsync.medico.infrastructure.persistence.entity;

import com.sanaltomaz.medsync.medico.domain.Especialidade;
import com.sanaltomaz.medsync.shared.domain.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "medico")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicoEntity implements Persistable<Long> {

    @Id
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;
    private String telefone;

    @Column(nullable = false, unique = true)
    private String crm;

    @Column(nullable = false)
    private Especialidade especialidade;

    // @Column(nullable = false)
    // private Endereco endereco;

    private boolean ativo;

    @Override
    public @Nullable Long getId() {
        return 0L;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
