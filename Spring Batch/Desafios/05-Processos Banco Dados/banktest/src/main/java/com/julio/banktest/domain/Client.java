package com.julio.banktest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Client {
    String nome;
    Integer idade;
    String email;
    Long faixa_salarial;
}
