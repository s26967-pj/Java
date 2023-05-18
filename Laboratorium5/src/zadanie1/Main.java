package zadanie1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 100; i += 2) {
            evenNumbers.add(i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Liczba elementów w liście: " + evenNumbers.size());

        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.println("Liczba " + evenNumbers.get(i) + " znajduje się pod indeksem " + i);
        }

        System.out.println("Czas działania programu: " + duration + " nanosekund.");
    }
}
