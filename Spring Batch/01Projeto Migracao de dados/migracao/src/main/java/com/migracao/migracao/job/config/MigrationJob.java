package com.migracao.migracao.job.config;

import com.migracao.migracao.domain.DadosBancarios;
import com.migracao.migracao.domain.Pessoa;
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
public class MigrationJob {
    @Autowired
    StepBuilderFactory stepBuilderFactory;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private ItemReader<Pessoa> migrationPessoaReader;
    @Autowired
    private ItemWriter<Pessoa> migrationPessoaWriter;
    @Autowired
    private ItemReader<DadosBancarios> migrationDataBankReader;
    @Autowired
    private ItemWriter<DadosBancarios> migrationDataBankWriter;

    @Bean
    public Job ProjJob() {
        return jobBuilderFactory.get("migrationJob")
                .start(migrationPessoaStep())
                .next(migrationDataBankStep())
                .incrementer(new RunIdIncrementer())
                .build();
    }

    @Bean
    public Step migrationPessoaStep() {
        return stepBuilderFactory.get("migrationPessoaStep")
                .<Pessoa, Pessoa>chunk(1)
                .reader(migrationPessoaReader)
                .writer(migrationPessoaWriter)
                .build();
    }

    @Bean
    public Step migrationDataBankStep() {
        return stepBuilderFactory.get("migrationDataBankWriter")
                .<DadosBancarios, DadosBancarios>chunk(1)
                .reader(migrationDataBankReader)
                .writer(migrationDataBankWriter)
                .build();
    }
}