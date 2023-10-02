package cz.inventi.kpj.annotation.processors;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */
//@Data Data annotation does not work for me on my setup.
@AllArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
public class User {
  private String username;
  private String firstname;
  private String lastname;
  private String phone;

}
