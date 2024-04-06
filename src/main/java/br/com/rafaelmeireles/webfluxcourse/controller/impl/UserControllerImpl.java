package br.com.rafaelmeireles.webfluxcourse.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelmeireles.webfluxcourse.controller.UserController;
import br.com.rafaelmeireles.webfluxcourse.entity.User;
import br.com.rafaelmeireles.webfluxcourse.model.request.UserRequest;
import br.com.rafaelmeireles.webfluxcourse.model.response.UserResponse;
import br.com.rafaelmeireles.webfluxcourse.service.UserService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserControllerImpl implements UserController {

    private final UserService service;

    @Override
    public ResponseEntity<Mono<Void>> save(UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request).then());
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> find(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public ResponseEntity<Flux<UserResponse>> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> update(String id, UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
