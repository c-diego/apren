package br.dev.diegocorte.module3;

import br.dev.diegocorte.landonhotel.Room;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author diego
 */
public class HashSetExample {

  public static void main(String[] args) {

    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);

    // Set doesn't allow duplicate
    // HashSet doesn't guarantee order
    Set<Room> rooms = new HashSet<>();
    rooms.add(piccadilly);
    rooms.add(oxford);
    rooms.add(oxford);
    rooms.add(oxfordDuplicate);

    rooms.stream()
            .map(r -> r.getName())
            .forEach(System.out::println);

    // LinkedHashSet mantains order
    Set<Room> rooms2 = new LinkedHashSet<>();
    rooms2.add(piccadilly);
    rooms2.add(oxford);
    rooms2.add(oxford);
    rooms2.add(oxfordDuplicate);

    System.out.println("\nLinkedHashSet\n");
    rooms2.stream()
            .map(r -> r.getName())
            .forEach(System.out::println);
    
    
    // Unmodifiable SET
    Set<Room> otherRooms = Set.of(piccadilly, oxford);
    
    // Unmodifiable copy
    Set<Room> roomsCopy = Set.copyOf(rooms);
    
  }
}
