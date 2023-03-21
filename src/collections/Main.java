package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter num numbers");
    int n = Integer.parseInt(br.readLine());

    System.out.println("enter" + n + "numbers");
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.println("numbers = " + numbers);
    System.out.println("Collection max(numbers) = " + Collections.max(numbers));
    System.out.println("Collection min(numbers) = " + Collections.min(numbers));
    Collections.reverse(numbers); //развернули в обратном порядке
    System.out.println("После Collections.sort(numbers) список numbers = " + numbers);

    Set<Integer> numberSet = new HashSet<>();
    numberSet.addAll(numbers); //любую коллекцию через AddAll можно "расширить" любой коллекцией
    // в том числе Map.keySet() и Map.values()

    Map<String, String> phonebook = new HashMap<>();
    phonebook.put("A", "+123");
    phonebook.put("е", "+234");
    phonebook.put("B", "+345");

    List<String> sortedNames = new ArrayList<>(phonebook.keySet());
    Collections.sort(sortedNames);
    for(String name : phonebook.keySet()) {
      System.out.println(name + ": " + phonebook.get(name));
    }
    String word1 = "mama";
    String word2 = "mia";
   System.out.println(word1.compareTo(word2));

    /*
    Integer[] numbersArray = numbers.toArray(new Integer[0]); // можно коллекцию превратить в массив
    Collections.max(); //находит максимум - для всех Collection
    Collections.min(); //находит минимум - для всех Collection
    Collections.reverse();
    Collections.sort();

     */

  }
}
