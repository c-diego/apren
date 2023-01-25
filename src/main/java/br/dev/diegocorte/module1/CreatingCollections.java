package br.dev.diegocorte.module1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author diego
 */
public class CreatingCollections {

  public static void main(String[] args) {
    
    // cant do Collection c = new Collection();
    
    Collection<String> groceryList = new ArrayList<>();
    groceryList.addAll(List.of("Rice", "Beans", "Tomate", "Lettuce", "Rice"));
    
    Set<String> groceryListSet = new HashSet<>(groceryList);
    
    System.out.println("ArrayList: " + groceryList);
    System.out.println("HashSet:   " + groceryListSet);
    
  }
  
}
