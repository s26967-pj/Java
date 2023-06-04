import java.util.Scanner;

class Transakcja {

    public void wykonajTransakcje(Scanner scanner, Bankomat bankomat) {
        int kwotaWydania = -1;

        while (kwotaWydania <= 0 || kwotaWydania % 10 != 0 || kwotaWydania > bankomat.getSaldo() || kwotaWydania > bankomat.getKWOTA_DOSTEPNA_DO_WYPLATY()) {
            System.out.println("Podaj kwotę do wypłaty:");
            kwotaWydania = bankomat.getInputNumber(scanner);

            if (kwotaWydania == 0) {
                System.out.println("Nie można wypłacić kwoty równiej 0. Proszę wprowadzić inną kwotę.");
            } else if (kwotaWydania % 10 != 0) {
                System.out.println("Kwota do wypłaty musi być wielokrotnością 10. Proszę wprowadzić inną kwotę.");
            } else if (kwotaWydania > bankomat.getSaldo()) {
                System.out.println("Nie masz wystarczająco dużo środków na koncie. Proszę wprowadzić inną kwotę.");
            } else if (kwotaWydania > bankomat.getKWOTA_DOSTEPNA_DO_WYPLATY()) {
                System.out.println("Nie mamy tyle gotówki w sejfie. Proszę wprowadzić mniejszą kwotę.");
            } else if (kwotaWydania < 0) {
                System.out.println("Wprowadzona wartość jest nieprawidłowa. Kwota nie może być ujemna. Proszę wprowadzić inną kwotę.");
            }
        }

        System.out.println("Transakcja zakończona sukcesem. Wypłacono: " + kwotaWydania);
        bankomat.setSaldo(bankomat.getSaldo() - kwotaWydania);
        bankomat.setKWOTA_DOSTEPNA_DO_WYPLATY(bankomat.getKWOTA_DOSTEPNA_DO_WYPLATY() - kwotaWydania);
    }
}
