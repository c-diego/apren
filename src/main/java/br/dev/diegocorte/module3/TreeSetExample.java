package br.dev.diegocorte.module3;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author diego
 */
public class TreeSetExample {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);

    NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

    System.out.println("numberTree");
    numberTree.stream()
            .forEach(System.out::println);

    System.out.println("\nDescending numberTree");
    numberTree.descendingSet()
            .stream()
            .forEach(System.out::println);

    System.out.println("\nHead");
    numberTree.headSet(2000)
            .stream()
            .forEach(System.out::println);

    System.out.println("\nTail");
    numberTree.headSet(2000)
            .stream()
            .forEach(System.out::println);

    System.out.println("\nSubSet");
    numberTree.subSet(1500, 2750)
            .stream()
            .forEach(System.out::println);

    //Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
    System.out.println("\nLower\n" + numberTree.lower(1000));

    //Returns the least element in this set strictly greater than the given element, or null if there is no such element.
    System.out.println("\nHigher\n" + numberTree.higher(1000));

    //Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
    System.out.println("\nCelling\n" + numberTree.ceiling(1000));

    //Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
    System.out.println("\nFloor\n" + numberTree.ceiling(1000));

    System.out.println("\nPoolFirst");
    numberTree.pollFirst();
    numberTree.stream()
            .forEach(System.out::println);

    System.out.println("\nPoolLast");
    numberTree.pollLast();
    numberTree.stream()
            .forEach(System.out::println);

  }
}
