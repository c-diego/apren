package br.dev.diegocorte.module5;

import br.dev.diegocorte.landonhotel.Guest;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author diego
 */
public class QueueImplementations {

  public static void main(String[] args) {

    Guest john = new Guest("John", "Doe", false);
    Guest bob = new Guest("Bob", "Doe", false);
    Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
    Guest siri = new Guest("Siri", "Doe", true); //loyalty program

    Queue<Guest> checkinList = new ArrayDeque<>(); // FIFO
    //Guest guest = checkinList.remove(); // throws Exception;
    Guest guest = checkinList.poll(); // returns null;
    checkinList.add(john); // returns true or throws Exception
    checkinList.offer(bob); // returns true or false
    checkinList.offer(sonia);
    checkinList.offer(siri);

    guest = checkinList.element(); // may throw exception
    System.out.println(guest);

    guest = checkinList.peek(); // may return null
    System.out.println(guest);

    print(checkinList);

    
    Comparator loyaltyProg 
            = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed(); 
    
    // PriorityQueue
    Queue<Guest> checkinList2 = new PriorityQueue<>(loyaltyProg);
    checkinList2.add(john); // returns true or throws Exception
    checkinList2.offer(bob); // returns true or false
    checkinList2.offer(sonia);
    checkinList2.offer(siri);
    print(checkinList2);
  }

  public static void print(Queue<Guest> queue) {

    System.out.format("%n--Queue Contents--%n");

    int x = 0;
    for (Guest guest : queue) {
      System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)" : "");
    }

    System.out.println("");

  }
}
