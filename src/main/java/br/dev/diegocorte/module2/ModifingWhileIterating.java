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
public class ModifingWhileIterating {

  public static void main(String[] args) {

    Collection<Room> rooms = new ArrayList<>();

    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);
    Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

    cambridge.setPetFriendly(true);
    oxford.setPetFriendly(true);
    westminister.setPetFriendly(true);

    rooms.addAll(List.of(
            cambridge,
            manchester,
            piccadilly,
            oxford,
            victoria,
            westminister
    ));

    Collection<Room> roomsToRemove = new ArrayList<>();
    for (Room room : rooms) {

      if (!room.isPetFriendly()) {
//      rooms.remove(room); // Will throw CuncurrentModificationException
        roomsToRemove.add(room);
      }
    }
    rooms.removeAll(roomsToRemove);
   
    for(Room room : rooms)
      System.out.println(room.getName());

    
    Iterator<Room> it = rooms.iterator();
    while (it.hasNext()) {
      if (it.next().getCapacity() >= 5)
        it.remove();
    }
    
    System.out.println("#################");
    for(Room room : rooms)
      System.out.println(room.getName());
    
  }
}
