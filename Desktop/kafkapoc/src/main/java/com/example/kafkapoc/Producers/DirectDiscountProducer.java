package com.example.kafkapoc.Producers;

import com.example.kafkapoc.Constants.Topics;
import com.example.kafkapoc.avro.DirectDiscountAvro;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;


@RestController
@RequestMapping("/producer")
public class DirectDiscountProducer {

    String topic= Topics.directDiscount;

    @PostMapping("/direct-discount")
    public void addContents( @RequestBody DirectDiscountAvro recordAvro) throws InterruptedException {
        try (KafkaProducer<String, DirectDiscountAvro> producer = new KafkaProducer<>(new Properties())) {
                final String id = "1";
                final ProducerRecord<String, DirectDiscountAvro> record =
                        new ProducerRecord<>(topic,
                                id,
                                recordAvro);
                producer.send(record);
        }

    }

}
