package br.dev.diegocorte.module4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ListImplementations {

  public static void main(String[] args) {

    List<String> groceryList = new ArrayList<>();
    
    groceryList.add("Bread"); // returns true
    groceryList.add(0, "Bread"); //void
    groceryList.forEach(System.out::println);
    
    System.out.println();
    
    //bulk
    groceryList.addAll(1, List.of("Butter", "Milk", "Eggs", "Cereals")); // returns true
    groceryList.set(5, "Soda"); // returns "Bread"
    groceryList.forEach(System.out::println);
    
    System.out.println("\n"+groceryList.get(2)); // returns "Milk"
    System.out.format("%n%d%n", groceryList.indexOf("Soda")); // returns 5
    System.out.format("%n%d%n", groceryList.lastIndexOf("Juice")); 
    
    System.out.format("%n%s%n",groceryList.remove(5));
    
  }
}
