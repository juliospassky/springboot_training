package com.migracao.migracao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosBancarios {
    Integer id;
    Integer pessoaId;
    Integer agencia;
    Integer conta;
    Integer banco;

}
