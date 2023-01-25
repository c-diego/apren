package br.dev.diegocorte.module6;

import br.dev.diegocorte.landonhotel.Guest;
import br.dev.diegocorte.landonhotel.Room;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author diego
 */
public class IteratingMapExample {

  public static void main(String[] args) {
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Guest john = new Guest("John", "Doe", false);
    Guest maria = new Guest("Maria", "Doe", true);

    Map<Room, Guest> assignments = new HashMap<>();
    assignments.put(oxford, maria);
    assignments.put(piccadilly, john);

//  Set<Entry<Room,Guest>> collectionView = assignments.entrySet();
    for (Entry<Room, Guest> entry : assignments.entrySet()) {
      Room r = entry.getKey();
      Guest g = entry.getValue();
      System.out.format("%s : %s%n", r.getName(), g.getFirstName());
    }

    System.out.println("#####");
    assignments.keySet()
            .stream()
            .map(Room::getName)
            .forEach(System.out::println);

  }
}
