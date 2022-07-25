package com.example.kafkapoc.Producers;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class DirectDiscountProducer {

//    final String topic= Topics.directDiscount;
//
//    @PostMapping("/direct-discount")
//    public void addContents(@RequestBody DirectDiscount directDiscount) throws InterruptedException {
//        try (KafkaProducer<String, DirectDiscountAvro> producer = new KafkaProducer<>(new Properties())) {
//                final String id = directDiscount.getSku();
//                DirectDiscountAvro recordAvro=new DirectDiscountAvro();
//                recordAvro.setSku(directDiscount.getSku());
//                recordAvro.setDirectDiscount(directDiscount.getDirectDiscount());
//                final ProducerRecord<String, DirectDiscountAvro> record =
//                        new ProducerRecord<>(topic,
//                                id,
//                                recordAvro);
//                producer.send(record);
//        }
//
//    }

}
