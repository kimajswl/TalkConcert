package com.example.talkconcert;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/kafka/sendMessage")
    public String sendMessage(@RequestParam String message) {
        log.info("메시지: {}", message);
        kafkaProducer.sendMessage(message);

        return "성공!";
    }

}
