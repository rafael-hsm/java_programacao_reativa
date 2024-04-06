package br.com.rafaelmeireles.webfluxcourse.repository;

import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;

import br.com.rafaelmeireles.webfluxcourse.entity.User;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class UserRepository {


    private final ReactiveMongoTemplate mongoTemplate;

    @SuppressWarnings("null")
    public Mono<User> save(final User user) {
        return mongoTemplate.save(user);
    }
}
