package br.com.rafaelmeireles.webfluxcourse.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;

import br.com.rafaelmeireles.webfluxcourse.entity.User;
import br.com.rafaelmeireles.webfluxcourse.model.request.UserRequest;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = IGNORE,
    nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
}
