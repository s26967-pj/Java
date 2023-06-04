import java.util.Scanner;

public class Bankomat implements Welcome{
    private static final int PIN = 1234; // przykładowy PIN
    private static final int MAX_LICZBA_NIEUDANYCH_PROB = 2;
    private int saldo = 1000;
    private int KWOTA_DOSTEPNA_DO_WYPLATY = 500; // kwota dostępna do wypłaty
    private boolean kartaZablokowana = false;

    public Bankomat() {
        System.out.println(welcome());
    }

    public Bankomat(int saldo, int KWOTA_DOSTEPNA_DO_WYPLATY) {
        this.saldo = saldo;
        this.KWOTA_DOSTEPNA_DO_WYPLATY = KWOTA_DOSTEPNA_DO_WYPLATY;
    }



    public static void main(String[] args) {
        BankomatPremium bankomat = new BankomatPremium();
        bankomat.uruchom();
    }


    protected void uruchom() {
        if (KWOTA_DOSTEPNA_DO_WYPLATY == 0) {
            System.out.println("Bankomat jest zablokowany. Brak dostępnych środków w sejfie.");
            return;
        }

        System.out.println("Proszę włożyć kartę płatniczą.");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (!kartaZablokowana) {
            System.out.println("Podaj numer PIN:");
            int pin = getInputNumber(scanner);

            int liczbaNieudanychProb = 0;

            while (pin != PIN && liczbaNieudanychProb < MAX_LICZBA_NIEUDANYCH_PROB) {
                System.out.println("Niepoprawny PIN. Podaj PIN ponownie:");
                pin = getInputNumber(scanner);
                liczbaNieudanychProb++;
            }

            if (pin != PIN) {
                System.out.println("Niepoprawny PIN. Karta została zablokowana.");
                setKartaZablokowana(true);
            } else {
                System.out.println("Poprawny PIN.");



                Transakcja transakcja = new Transakcja();
                transakcja.wykonajTransakcje(scanner, this);

                return;
            }
        }
    }

    protected int getInputNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Wprowadzona wartość jest nieprawidłowa. Nasz Bankomat obsługuje tylko liczby:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isKartaZablokowana() {
        return kartaZablokowana;
    }

    public void setKartaZablokowana(boolean kartaZablokowana) {
        this.kartaZablokowana = kartaZablokowana;
    }

    public int getKWOTA_DOSTEPNA_DO_WYPLATY() {
        return KWOTA_DOSTEPNA_DO_WYPLATY;
    }

    public void setKWOTA_DOSTEPNA_DO_WYPLATY(int KWOTA_DOSTEPNA_DO_WYPLATY) {
        this.KWOTA_DOSTEPNA_DO_WYPLATY = KWOTA_DOSTEPNA_DO_WYPLATY;
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "saldo=" + saldo +
                ", KWOTA_DOSTEPNA_DO_WYPLATY=" + KWOTA_DOSTEPNA_DO_WYPLATY +
                ", kartaZablokowana=" + kartaZablokowana +
                '}';
    }

    @Override
    public String welcome() {
        return "Witaj w Bankomacie!";
    }
}
