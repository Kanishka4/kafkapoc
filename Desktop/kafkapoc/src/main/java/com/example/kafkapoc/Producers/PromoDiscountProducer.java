package com.example.kafkapoc.Producers;

import com.example.kafkapoc.Constants.Topics;
import com.example.kafkapoc.Models.PromoDiscount;
import com.example.kafkapoc.avro.PromoDiscountAvro;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/producer")
public class PromoDiscountProducer {
    final String topic= Topics.promoDiscount;

    @PostMapping(value="/promo/discount")
    public void addContents( @RequestBody PromoDiscount promoDiscount) throws InterruptedException {
        try (KafkaProducer<String, PromoDiscountAvro> producer = new KafkaProducer<>(new Properties())) {
            final String id = promoDiscount.getSku();
            PromoDiscountAvro recordAvro=new PromoDiscountAvro();
            recordAvro.setSku(promoDiscount.getSku());
            recordAvro.setPromoDiscount(promoDiscount.getPromoDiscount());
            final ProducerRecord<String, PromoDiscountAvro> record =
                    new ProducerRecord<>(topic,
                            id,
                            recordAvro);
            producer.send(record);
        }

    }
}
