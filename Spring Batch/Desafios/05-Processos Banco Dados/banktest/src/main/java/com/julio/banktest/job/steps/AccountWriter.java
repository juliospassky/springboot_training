package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountWriter {
    @Bean
    public ItemWriter<Client> jdbcCursorWriter() {
        return clientes -> clientes.forEach(System.out::println);
    }
}
