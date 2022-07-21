package com.example.kafkapoc.Producers;

import com.example.kafkapoc.Constants.Topics;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.kafkapoc.avro.PromoDiscountAvro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/producer")
public class PromoDiscountProducer {
    String topic= Topics.promoDiscount;

    @PostMapping("/promo-discount")
    public void addContents( @RequestBody PromoDiscountAvro recordAvro) throws InterruptedException {
        try (KafkaProducer<String, PromoDiscountAvro> producer = new KafkaProducer<>(new Properties())) {
            final String id = recordAvro.getSku().toString();
            final ProducerRecord<String, PromoDiscountAvro> record =
                    new ProducerRecord<>(topic,
                            id,
                            recordAvro);
            producer.send(record);
        }

    }
}
