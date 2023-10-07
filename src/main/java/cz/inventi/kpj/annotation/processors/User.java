package cz.inventi.kpj.annotation.processors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String username;

  private String firstname;

  private String lastname;

  private String phone;

}
