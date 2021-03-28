package com.migracao.migracao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pessoa {
    Integer id;
    String nome;
    String email;
    Date dataNascimento;
    Integer idade;
}
