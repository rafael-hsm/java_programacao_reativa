package br.com.rafaelmeireles.webfluxcourse.model.request;

public record UserRequest(
    String name,
    String email,
    String password
) {

}
