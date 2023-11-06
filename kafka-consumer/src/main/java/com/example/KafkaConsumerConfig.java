package com.example;

import static java.lang.StringTemplate.STR;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConsumerConfig {


  public static final String TOPIC_1 = "topic1";
  public static final String GROUP_ID = "groupId";

  @Bean
  public NewTopic topic(){
    return TopicBuilder.name(TOPIC_1)
        .partitions(10)
        .replicas(1)
        .build();
  }

  @KafkaListener(topics = TOPIC_1, groupId = GROUP_ID)
  public void listen(String in){
    System.out.println(STR." value recieved is \{in}");
  }
}
