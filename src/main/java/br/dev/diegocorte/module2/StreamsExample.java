package br.dev.diegocorte.module2;

import br.dev.diegocorte.landonhotel.Room;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author diego
 */
public class StreamsExample {

  public static void main(String[] args) {
    
    Collection<Room> rooms = new ArrayList<>();
    
    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);
    Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
    
    cambridge.setPetFriendly(true);
    manchester.setPetFriendly(true);
    piccadilly.setPetFriendly(true);

    rooms.addAll(List.of(
            cambridge,
            manchester,
            piccadilly,
            oxford,
            victoria,
            westminister
    ));
    
    rooms.stream()
            .filter(room -> !room.isPetFriendly())
            .map(room -> room.getName())
            .forEach(System.out::println);
    
    // Methods
    System.out.println("############");
    List<Room> petFriendlyRooms = rooms.stream()
            .filter(room -> room.isPetFriendly())
            .collect(Collectors.toList()); // collect 
    
    petFriendlyRooms.stream()
            .map(room -> room.getName())
            .forEach(System.out::println);
    
    double revenue = rooms.stream()
            .mapToDouble(Room::getRate)
            .sum();
    
    System.out.println("Revenue: " + revenue);
  }
}
