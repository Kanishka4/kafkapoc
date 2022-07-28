package com.example.kafkapoc.Producers;

import com.example.kafkapoc.Constants.Topics;
import com.example.kafkapoc.Models.PromoDiscount;
import com.example.kafkapoc.avro.PromoDiscountAvro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class PromoDiscountProducer {
    final String topic= Topics.promoDiscount;

    @PostMapping("/promo/discount")
    public void addContents( @RequestBody PromoDiscount promoDiscount) throws InterruptedException {
        final String id = promoDiscount.getSku();
        PromoDiscountAvro recordAvro=new PromoDiscountAvro();
        recordAvro.setSku(promoDiscount.getSku());
        recordAvro.setPromoDiscount(promoDiscount.getPromoDiscount());
        send(recordAvro);
    }

    @Autowired
    private KafkaTemplate<String, PromoDiscountAvro> kafkaTemplate;

    private void send(PromoDiscountAvro promoDiscount){
        ListenableFuture<SendResult<String,PromoDiscountAvro>> future=  kafkaTemplate.send(topic,String.valueOf(promoDiscount.getSku()),promoDiscount);
        future.addCallback(new ListenableFutureCallback<SendResult<String, PromoDiscountAvro>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Message failed to produce");
            }

            @Override
            public void onSuccess(SendResult<String, PromoDiscountAvro> result) {
                System.out.println("promoDiscount Avro message successfully produced");
            }
        });

    }
}

