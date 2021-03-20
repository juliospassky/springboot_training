package com.julio.banktest.job.config;

import com.julio.banktest.domain.Client;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class AccountJob {
    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job initJob(ItemReader<Client> jdbcCursorItemReader, ItemWriter<Client> jdbcCursorWriter) {
        return jobBuilderFactory.get("initJob")
                .incrementer(new RunIdIncrementer())
                .start(accountStep(jdbcCursorItemReader, jdbcCursorWriter))
                .build();
    }

    @Bean
    public Step accountStep(ItemReader<Client> jdbcCursorItemReader, ItemWriter<Client> jdbcCursorWriter) {
        return stepBuilderFactory.get("accountStep")
                .<Client, Client>chunk(1)
                .reader(jdbcCursorItemReader)
                .writer(jdbcCursorWriter)
                .build();
    }


}
