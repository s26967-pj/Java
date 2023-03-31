import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj  Łukaszu!");
        //Zadanie1();
        //Zadanie2();
        //DefaultValues.Zadanie3();
        //Zadanie4();
        //Zadanie5();
        //Zadanie6();
        //Zadanie7();
        //Zadanie8();
        //Zadanie9();
        //Zadanie10();
        Zadanie11();

    }


    public static void Zadanie1() {
        System.out.println("Imię: Łukasz");
        System.out.println("Nazwisko: Aleksandrowicz");
        System.out.println("Grupa: 22C");
        System.out.println("Kierunek studiów: Informatyka");
    }
    public static void Zadanie2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię studenta: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj grupę studenta: ");
        String grupa = scanner.nextLine();

        System.out.print("Podaj kierunek studiów : ");
        String kierunek = scanner.nextLine();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek studiów: " + kierunek);


    }


    public class DefaultValues {

        private static boolean aBoolean;
        private static short aShort;
        private static int anInt;
        private static long aLong;
        private static float aFloat;
        private static double aDouble;
        private static char aChar;
        private static String str;

        public static void Zadanie3() {


            System.out.println("boolean: " + aBoolean);
            System.out.println("short: " + aShort);
            System.out.println("int: " + anInt);
            System.out.println("long: " + aLong);
            System.out.println("float: " + aFloat);
            System.out.println("double: " + aDouble);
            System.out.println("char: " + aChar);
            System.out.println("String: " + str);


        }
    }
    public static void Zadanie4() {

        String s1 = "Czesc";
        String s2 = "Czesc";

        if (s1.equals(s2)) {
            System.out.println("prawda");
        } else {
            System.out.println("falsz");
        }
    }

    public static void Zadanie5() {
        // inkrementacja i dekrementacja
        int a = 5;
        int b = 10;
        System.out.println("Wartość początkowa a: " + a);
        System.out.println("Wartość początkowa b: " + b);

        a++;
        System.out.println("Po inkrementacji a: " + a);

        b--;
        System.out.println("Po dekrementacji b: " + b);

        // operatory arytmetyczne
        int x = 5;
        int y = 10;
        int z;

        z = x + y;
        System.out.println("x + y = " + z);

        z = x - y;
        System.out.println("x - y = " + z);

        z = x * y;
        System.out.println("x * y = " + z);

        z = y / x;
        System.out.println("y / x = " + z);

        z = y % x;
        System.out.println("y % x = " + z);

        // operatory relacyjne
        int m = 5;
        int n = 10;
        int o = 15;
        System.out.println("Wartość początkowa m: " + m);
        System.out.println("Wartość początkowa n: " + n);
        System.out.println("Wartość początkowa o: " + o);
        System.out.println("m < n: " + (m < n) + ",   n < m " + (n < m) +  ",   m < o " + (m < o));
        System.out.println("m > n: " + (m > n) + ",   n > m " + (n > m) + ",   m > o " + (m > o));
        System.out.println("m <= n: " + (m <= n) + ",   n <= m " + (n <= m) + ",   m <= o " + (m <= o));
        System.out.println("m >= n: " + (m >= n) + ",   n >= m" + (n >= m) + ",   m >= o " + (m >= o));
        System.out.println("m == n: " + (m == n) + ",   n == m " + (n == m) + ",   m == o " + (m == o));
        System.out.println("m != n: " + (m != n) + ",   n != m " + (n != m) + ",   m != o " + (m != o));
    }

    public static void Zadanie6() {
    int[][] matrix = new int[3][3];

    matrix[0][0] = 0;
    matrix[0][1] = 10;
    matrix[0][2] = 20;
    matrix[1][0] = 1;
    matrix[1][1] = 11;
    matrix[1][2] = 21;
    matrix[2][0] = 2;
    matrix[2][1] = 12;
    matrix[2][2] = 22;

        System.out.println("Macierz początkowa:");
    printMatrix(matrix);

    // zamiana wierszy miejscami
    int[] tempRow = matrix[0];
    matrix[0] = matrix[2];
    matrix[2] = tempRow;

        System.out.println("Macierz po zamianie wierszy miejscami:");
    printMatrix(matrix);
}

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public static void Zadanie7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj promień podstawy walca: ");
        double radius = scanner.nextDouble();

        System.out.print("Podaj wysokość walca: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.println("Pojemność walca wynosi: " + volume);
    }


    public static void Zadanie8() {
    System.out.println("P      \tQ     \tAND    \tOR    \tXOR   \tNOT");
    boolean P, Q;

    P = true;
    Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);

    P = true;
    Q = false;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);

    P = false;
    Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);

    P = false;
    Q = false;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
}

    public static void Zadanie9() {
        char poprawnaOdpowiedz = 'M';
        System.out.print("Wciśnij klawisz z zakresu od A do Z: ");

        try {
            char odpowiedz = (char) System.in.read();
            odpowiedz = Character.toUpperCase(odpowiedz);

            if (odpowiedz == poprawnaOdpowiedz) {
                System.out.println("Dobrze!");
            } else if (odpowiedz < poprawnaOdpowiedz) {
                System.out.println("Źle! Za nisko. Spróbuj jeszcze raz.");
            } else {
                System.out.println("Źle! Za wysoko. Spróbuj jeszcze raz.");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd wejścia/wyjścia: " + e.getMessage());
        }

    }


    public static void Zadanie10() {
        for (int i = 0; i <= 14; i++) {
            int potega = (int) Math.pow(2, i);
            System.out.println("2 do potęgi " + i + " wynosi = " + potega);
        }
    }
    public static void Zadanie11() {
    Vehicle myCar = new Vehicle(5, 70.0, 8);
    double myCarRange = myCar.calculateRange();
        System.out.println("The car's range is " + myCarRange + " km.");

    Vehicle miniVan = new Vehicle(9, 100.0, 10.0);
    Vehicle sportsCar = new Vehicle(2, 60.0, 15.0);
    double miniVanRange = miniVan.calculateRange();
    double sportsCarRange = sportsCar.calculateRange();

    int roundedRangeM = (int) Math.round(miniVanRange);
    int roundedRangeS = (int) Math.round(sportsCarRange);
        System.out.println("MiniVan range: " + roundedRangeM + " km");
        System.out.println("SportsCar range: " + roundedRangeS + " km");
}
}

class Vehicle {
    private int passengers;
    private double fuelCapacity;
    private double fuelConsumption;

    public Vehicle(int passengers, double fuelCapacity, double fuelConsumption) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double calculateRange() {
        double range = fuelCapacity / fuelConsumption * 100;
        return range;
    }
}














