package br.dev.diegocorte.module1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author diego
 */
public class MethodsExample {

  public static void main(String[] args) {

    Collection<String> groceryList = new ArrayList<>();

    // Insert
    groceryList.add("Cheese"); // returns true;
    groceryList.addAll(List.of("Ham", "Bread", "Apple", "Burger", "Tomate", "Mayo", "Pickles")); // returns true // bulk operation

    // Inspect
    groceryList.contains("Apple"); // returns true
    groceryList.containsAll(List.of("Ham", "Cheese")); // returns true // bulk operarion
    groceryList.isEmpty(); // returns false;
    groceryList.size(); // returns 8
    
    // Remove
    groceryList.remove("Apple"); // returns true
    groceryList.removeAll(List.of("Tomate", "Pickles")); // returns true // bulk operation
    groceryList.retainAll(List.of("Cheese", "Bread", "Burger", "Ham")); // returns true // bulk operation
    groceryList.clear(); // void // bulk operarion
    System.out.println(groceryList);
  }
}
