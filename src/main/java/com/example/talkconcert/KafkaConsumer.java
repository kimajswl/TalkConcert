package com.example.talkconcert;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "topic1", groupId = "foo")
    public void consumer(String message) {
        log.info("받은 메시지: {}", message);
    }
}
