package com.julio.banktest.job.steps;

import com.julio.banktest.domain.Account;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountWriter {
    @Bean
    public ItemWriter<Account> jdbcCursorWriter() {
        return account -> account.forEach(System.out::println);
    }
}
