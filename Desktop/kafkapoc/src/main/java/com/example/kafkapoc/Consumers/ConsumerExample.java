package com.example.kafkapoc.Consumers;

import com.example.kafkapoc.avro.FinalProductPriceAvro;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Properties;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

@Log4j2
@Component
public class ConsumerExample {

  @KafkaListener(topics = "test")
  public void consume() {
    try (final KafkaConsumer<String, FinalProductPriceAvro> consumer = new KafkaConsumer<>(new Properties())) {
      consumer.subscribe(Collections.singletonList(TOPIC));

      while (true) {
        ConsumerRecords<String, FinalProductPriceAvro> records = consumer.poll(100);
        for (ConsumerRecord<String, FinalProductPriceAvro> record : records) {
          String key = record.key();
         FinalProductPriceAvro value = record.value();
          System.out.printf("key = %s, value = %s%n", key, value);
        }
      }
    }

  }
}
