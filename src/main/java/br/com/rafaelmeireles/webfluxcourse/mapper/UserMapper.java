package br.com.rafaelmeireles.webfluxcourse.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.rafaelmeireles.webfluxcourse.entity.User;
import br.com.rafaelmeireles.webfluxcourse.model.request.UserRequest;

@Mapper(
    componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
}
