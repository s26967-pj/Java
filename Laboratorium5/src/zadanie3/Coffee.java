package zadanie3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> coffeeList = new ArrayList<String>();
        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        System.out.println("Lista kaw:");
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }

        System.out.println("\nPrzejście po liście za pomocą iteratora:");
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nWypisanie kaw dużymi literami za pomocą pętli foreach:");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }

        System.out.println("\nPierwsze 4 litery każdej kawy:");
        for (String coffee : coffeeList) {
            System.out.println(coffee.substring(0, 4));
        }
    }
}
