package br.com.primeiroprojetospringbatch.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class ImprimeTasklet implements Tasklet {

//    @StepScope
//    public Tasklet getTasklet(@Value("#{jobParameters['name']}") String name) {
//        return new Tasklet() {
//            @Override
//            public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
//                out.printf("Olá, %s%n", name);
//                return RepeatStatus.FINISHED;
//            }
//        };
//    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        log.warn("Olá, mundo");
        return RepeatStatus.FINISHED;
    }
}
