package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Account;
import com.julio.banktest.domain.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountProcessor {

    @Bean
    public ItemProcessor<Client, Account> doProcessor() {
        return this::processor;
    }

    private Account processor(Client client) {
        return new Account(client);
    }

}
