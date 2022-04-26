package cz.inventi.kpj.annotation.processors;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Add lombok for adding getters, setters, toString, hashCode, equals, no
 * argument constructor and all argument constructor
 */
public class User {

  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private String firstname;

  @Getter
  @Setter
  private String lastname;

  @Getter
  @Setter
  private String phone;

  public User() {
  }

  public User(String username, String firstname, String lastname, String phone) {
    this.username = username;
    this.firstname = firstname;
    this.lastname = lastname;
    this.phone = phone;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 97 * hash + Objects.hashCode(this.username);
    hash = 97 * hash + Objects.hashCode(this.firstname);
    hash = 97 * hash + Objects.hashCode(this.lastname);
    hash = 97 * hash + Objects.hashCode(this.phone);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final User other = (User) obj;
    if (!Objects.equals(this.username, other.username)) {
      return false;
    }
    if (!Objects.equals(this.firstname, other.firstname)) {
      return false;
    }
    if (!Objects.equals(this.lastname, other.lastname)) {
      return false;
    }
    return Objects.equals(this.phone, other.phone);
  }

  @Override
  public String toString() {
    return "User{" + "username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + '}';
  }


}
