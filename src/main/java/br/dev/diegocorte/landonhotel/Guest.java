package br.dev.diegocorte.landonhotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author diego
 */
public class Guest {

  private String firstName;

  private String lastName;

  private boolean loyaltyProgramMember;

  private List<Room> preferredRooms;

  public Guest(String firstName, String lastName, boolean loyaltyProgramMember) {
    this.preferredRooms = new ArrayList<>();
    this.firstName = firstName;
    this.lastName = lastName;
    this.loyaltyProgramMember = loyaltyProgramMember;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public boolean isLoyaltyProgramMember() {
    return loyaltyProgramMember;
  }

  public void setLoyaltyProgramMember(boolean loyaltyProgramMember) {
    this.loyaltyProgramMember = loyaltyProgramMember;
  }

  public List<Room> getPreferredRooms() {
    return preferredRooms;
  }

  public void setPreferredRooms(List<Room> preferredRooms) {
    this.preferredRooms = preferredRooms;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.firstName);
    hash = 97 * hash + Objects.hashCode(this.lastName);
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
    final Guest other = (Guest) obj;
    if (!Objects.equals(this.firstName, other.firstName)) {
      return false;
    }
    return Objects.equals(this.lastName, other.lastName);
  }

  @Override
  public String toString() {
    return String.format("%s %s", this.firstName, this.lastName);
  }
}
