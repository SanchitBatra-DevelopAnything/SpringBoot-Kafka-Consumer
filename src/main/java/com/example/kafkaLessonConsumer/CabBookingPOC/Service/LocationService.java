package com.example.kafkaLessonConsumer.CabBookingPOC.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    //KafkaListener listens to the messages.

    @KafkaListener(topics="cab-location" , groupId="user-group")
    public void cabLocation(String location)
    {
        //location is injected from the topic. location received from the topic is injected as parameter.
        System.out.println(location);
    }
}
