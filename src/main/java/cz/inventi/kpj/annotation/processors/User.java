package cz.inventi.kpj.annotation.processors;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */

@Data
@RequiredArgsConstructor
public class User {

  private final String username;

  private final String firstname;
  private final String lastname;

  private final String phone;

}
