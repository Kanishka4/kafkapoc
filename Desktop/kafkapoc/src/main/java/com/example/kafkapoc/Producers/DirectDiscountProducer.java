package com.example.kafkapoc.Producers;

import com.example.kafkapoc.Constants.Topics;
import com.example.kafkapoc.Models.DirectDiscount;
import com.example.kafkapoc.avro.DirectDiscountAvro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DirectDiscountProducer {

    final String topic= Topics.directDiscount;
    @Autowired
    private KafkaProperties kafkaProperties;

    @PostMapping("/direct-discount")
    public void addContents(@RequestBody DirectDiscount directDiscount) throws InterruptedException {
        final String id = directDiscount.getSku();
        DirectDiscountAvro recordAvro=new DirectDiscountAvro();
        recordAvro.setSku(directDiscount.getSku());
        recordAvro.setDirectDiscount(directDiscount.getDirectDiscount());
        send(recordAvro);

    }


    @Autowired
    private KafkaTemplate<String, DirectDiscountAvro> kafkaTemplate;

    private void send(DirectDiscountAvro directDiscountAvro){
        ListenableFuture<SendResult<String,DirectDiscountAvro>> future=  kafkaTemplate.send(topic,String.valueOf(directDiscountAvro.getSku()),directDiscountAvro);
        future.addCallback(new ListenableFutureCallback<SendResult<String, DirectDiscountAvro>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Message failed to produce");
            }

            @Override
            public void onSuccess(SendResult<String, DirectDiscountAvro> result) {
                System.out.println("Avro message successfully produced");
            }
        });

    }
}
