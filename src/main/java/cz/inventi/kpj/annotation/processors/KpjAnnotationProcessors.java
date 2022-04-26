package cz.inventi.kpj.annotation.processors;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

public class KpjAnnotationProcessors {

  /**
   * 1. Implement necessary getters, setters etc. in the class {@link User}. <br/>
   * 2. Create an interface {@link UserMapper} with two methods<br/>
   * 2.1 {@link UserMapper#userToUserDTO(User) } <br/>
   * 2.2 {@link UserMapper#userDTOToUser(User) } <br/>
   * 3. Create a static field {@link UserMapper#INSTANCE} with the instance of
   * this mapper
   */

  @Mapper
  public interface UserMapper{
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(source = "firstname", target = "name")
    @Mapping(source = "lastname", target = "surname")

    UserDTO userToUserDTO(User user);

    @InheritInverseConfiguration
    User userDTOToUser(UserDTO user);

  }
  public static void main(String[] args) {
    User user = new User("tpoledny", "Tomas", "Poledny", "777123456");

    UserMapper mapper = UserMapper.INSTANCE;

    UserDTO userDTO = mapper.userToUserDTO(user);

    assertEquals(user.getUsername(), userDTO.getUsername());
    assertEquals(user.getFirstname(), userDTO.getName());
    assertEquals(user.getLastname(), userDTO.getSurname());
    assertEquals(user.getPhone(), userDTO.getPhone());
    System.out.println("Mapping to DTO: Success");

    User mappedUser = mapper.userDTOToUser(userDTO);

    System.out.println(user + " | " + mappedUser);
    assertEquals(user, mappedUser);
    System.out.println("Mapping back: Success");

    System.out.println("Done");
  }

  static void assertEquals(Object first, Object second) {
    if (!Objects.equals(first, second)) {
      throw new AssertionError();
    }
  }
}
