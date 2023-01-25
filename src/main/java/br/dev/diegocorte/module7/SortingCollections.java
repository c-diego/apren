package br.dev.diegocorte.module7;

import br.dev.diegocorte.landonhotel.Room;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author diego
 */
public class SortingCollections {

  public static void main(String[] args) {
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.0);

    List<Room> rooms = new ArrayList<>(List.of(piccadilly, cambridge, oxford, oxfordGuest, victoria));

    System.out.println("Insertion Order");
    rooms.stream()
            .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));

    //Collections.sort(rooms);
    rooms.sort(Comparator.naturalOrder()); // preferred

    System.out.format("%nNatural Order%n");
    rooms.stream()
            .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));

    rooms.sort(Room.RATE_COMPARATOR.reversed());
    
    System.out.format("%nCustom Order%n");
    rooms.stream()
            .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));
  }
}
