package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication
{
    private static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(KafkaConsumerApplication.class,args);
    }
}
