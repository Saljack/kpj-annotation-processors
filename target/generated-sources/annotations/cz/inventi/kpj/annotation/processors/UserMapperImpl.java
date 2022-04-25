package cz.inventi.kpj.annotation.processors;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-25T20:15:26+0200",
    comments = "version: 1.5.0.RC1, compiler: javac, environment: Java 17.0.2 (Eclipse Adoptium)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( user.getFirstname() );
        userDTO.setSurname( user.getLastname() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPhone( user.getPhone() );

        return userDTO;
    }

    @Override
    public User userDTOToUser(UserDTO user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setFirstname( user.getName() );
        user1.setLastname( user.getSurname() );
        user1.setUsername( user.getUsername() );
        user1.setPhone( user.getPhone() );

        return user1;
    }
}
