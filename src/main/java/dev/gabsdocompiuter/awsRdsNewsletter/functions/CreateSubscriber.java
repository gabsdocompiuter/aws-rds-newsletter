package dev.gabsdocompiuter.awsRdsNewsletter.functions;

import dev.gabsdocompiuter.awsRdsNewsletter.model.Subscriber;
import dev.gabsdocompiuter.awsRdsNewsletter.service.SubscriberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class CreateSubscriber {

    private final SubscriberService subscriberService;

    public CreateSubscriber(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @Bean
    public Consumer<String> create() {
        return subscriberService::create;
    }

    @Bean
    public Supplier<List<Subscriber>> findAll() {
        return subscriberService::findAll;
    }
}
