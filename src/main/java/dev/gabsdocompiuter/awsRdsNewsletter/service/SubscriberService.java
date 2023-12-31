package dev.gabsdocompiuter.awsRdsNewsletter.service;

import dev.gabsdocompiuter.awsRdsNewsletter.model.Subscriber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {

    private List<Subscriber> subscribers = new ArrayList<>();
    private AtomicInteger id = new AtomicInteger(0);

    public List<Subscriber> findAll() {
        return subscribers;
    }

    public void create(String email) {
        subscribers.add(Subscriber
                .builder()
                .id(id.addAndGet(1))
                .email(email)
                .build()
        );
    }
}
