package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication
{
    private static Logger LOGGER = LoggerFactory.getLogger(KafkaProducerApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(KafkaProducerApplication.class,args);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String,String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send(KafkaProducerConfig.TOPIC_1,"test");
            LOGGER.info("message sent");
        };
    }
}
