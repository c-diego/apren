package br.dev.diegocorte.module6;

import br.dev.diegocorte.landonhotel.Guest;
import br.dev.diegocorte.landonhotel.Room;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class MapMethods {

  public static void main(String[] args) {
    
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Guest john = new Guest("John", "Doe", false);
    Guest maria = new Guest("Maria", "Doe", true);
    
    Map<Room, Guest> assignments = new HashMap<>();
    
    // put returns null or the previous value
    assignments.put(oxford, maria);
    assignments.put(piccadilly, john);
    
    Guest guest = assignments.put(piccadilly, assignments.remove(oxford));
    assignments.putIfAbsent(oxford, guest);
    
    System.out.println("Piccadilly: " + assignments.get(piccadilly));
    System.out.println("Oxford: " + assignments.get(new Room("Oxford", "Suite", 5, 225.0)));
    
  }
}
