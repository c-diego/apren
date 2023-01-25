package br.dev.diegocorte.module1;

import br.dev.diegocorte.landonhotel.Room;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author diego
 */
public class GenericExample {

  public static void main(String[] args) {

    // you should always use generic type
    Collection<Room> genericType = new ArrayList<>();

    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);
    Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

    genericType.addAll(Arrays.asList(cambridge, manchester, piccadilly, oxford, victoria, westminister));

    genericType.stream()
            .map(room -> room.getName())
            .forEach(System.out::println);

    System.out.println(genericType);

    // you should avoid raw types
    Collection rawType = new ArrayList();
    rawType.add("Books");
    rawType.add(new Room("Manchester", "Suite", 5, 250.00));

    try {
      rawType.stream()
              .forEach(e -> System.out.println(((Room) e).getName()));
    } catch (ClassCastException ex) {
      System.err.println(ex.getMessage());
    }

  }
}
