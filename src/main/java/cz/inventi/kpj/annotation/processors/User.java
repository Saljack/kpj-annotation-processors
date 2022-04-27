package cz.inventi.kpj.annotation.processors;

import lombok.*;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {

  private String username;

  private String firstname;
  private String lastname;

  private String phone;

}
