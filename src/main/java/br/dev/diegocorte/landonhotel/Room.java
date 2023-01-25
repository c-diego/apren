package br.dev.diegocorte.landonhotel;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author diego
 */
public class Room implements Comparable<Room> {
  
  public static final Comparator<Room> RATE_COMPARATOR = Comparator.comparing(Room::getRate)
                                                          .thenComparing(Room::getName)
                                                          .thenComparing(Room::getType);

  private String name;

  private String type;

  private int capacity;

  private double rate;

  private boolean petFriendly;

  public Room(String name, String type, int capacity, double rate) {
    this.name = name;
    this.type = type;
    this.capacity = capacity;
    this.rate = rate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public boolean isPetFriendly() {
    return petFriendly;
  }

  public void setPetFriendly(boolean petFriendly) {
    this.petFriendly = petFriendly;
  }

  @Override
  public String toString() {
    return "Room [name=" + name + ", type=" + type + ", capacity=" + capacity + ", rate=" + rate + "]";
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 23 * hash + Objects.hashCode(this.name);
    hash = 23 * hash + Objects.hashCode(this.type);
    hash = 23 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
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
    final Room other = (Room) obj;
    if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(other.rate)) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    return Objects.equals(this.type, other.type);
  }

  @Override
  public int compareTo(Room o) {
    int result = this.getName().compareTo(o.getName());
    return result != 0 ? result : this.getType().compareTo(o.getType());
  }
}
