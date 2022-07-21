package com.example.kafkapoc;

import com.example.kafkapoc.avro.DataRecordAvro;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;


@RestController
@RequestMapping("/producer")
public class ProducerController {

    @PostMapping("/produce/{topic}")
    public void addContents(@RequestBody DataRecordAvro dataRecordAvro, @PathVariable("topic") String topic) throws InterruptedException {
        try (KafkaProducer<String, DataRecordAvro> producer = new KafkaProducer<String,DataRecordAvro>(new Properties())) {
                final String id = "1";
                final DataRecordAvro recordAvro = new DataRecordAvro( (long)1000);
                final ProducerRecord<String, DataRecordAvro> record =
                        new ProducerRecord<>(topic,
                                id,
                                recordAvro);
                producer.send(record);
        }

    }

}
