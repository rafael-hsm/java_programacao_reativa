package br.com.rafaelmeireles.webfluxcourse.service;

import org.springframework.stereotype.Service;

import br.com.rafaelmeireles.webfluxcourse.entity.User;
import br.com.rafaelmeireles.webfluxcourse.mapper.UserMapper;
import br.com.rafaelmeireles.webfluxcourse.model.request.UserRequest;
import br.com.rafaelmeireles.webfluxcourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }
}
