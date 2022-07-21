package com.example.kafkapoc;

import com.example.kafkapoc.avro.DataRecordAvro;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ConsumerExample {

  @KafkaListener(topics = "")
  public void consume(final ConsumerRecord<Long, DataRecordAvro> consumerRecord) {
    log.info("received {} {}", consumerRecord.key(), consumerRecord.value());

  }
}
