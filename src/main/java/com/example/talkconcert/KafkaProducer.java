package com.example.talkconcert;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "topic1";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
      log.info("보내는 메시지: {}", message);
      this.kafkaTemplate.send(TOPIC, message);
    }

}
