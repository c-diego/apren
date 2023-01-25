package br.dev.diegocorte.module2;

import br.dev.diegocorte.landonhotel.Room;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author diego
 */
public class Iterators {

  public static void main(String[] args) {

    Collection<Room> rooms = new ArrayList<>();
    
    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);
    Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

    rooms.addAll(List.of(
            cambridge,
            manchester,
            piccadilly,
            oxford,
            victoria,
            westminister
    ));

    Iterator<Room> iterator = rooms.iterator(); // Returns a new instance of iterator

    System.out.println(iterator.next()); // Advances one position forward in the collection
    System.out.println(iterator.next().getName()); // Advances one position forward in the collection

    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());
    }

    System.out.println("######");

    for (Room room : rooms) {
      System.out.println(room);
    }

  }
}
