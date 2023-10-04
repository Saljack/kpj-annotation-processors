package cz.inventi.kpj.annotation.processors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "firstname", target = "name")
    @Mapping(source = "lastname", target = "surname")
    UserDTO userToUserDTO(User user);

    @Mapping(source = "name", target = "firstname")
    @Mapping(source = "surname", target = "lastname")
    User userDTOToUser(UserDTO userDTO);
}