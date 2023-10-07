package cz.inventi.kpj.annotation.processors;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */

@Data
@NoArgsConstructor
public class User {

  private String username;

  private String firstname;

  private String lastname;

  private String phone;

}
