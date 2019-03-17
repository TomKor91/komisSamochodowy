package komisSamochodowy;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DodaneSamochody {

    public static void dodaneSamochody(List<Samochód>myList){
        Scanner scanner = new Scanner(System.in);

        Samochód samochód = new Samochód();
        System.out.println("Podaj kolor samochodu: ");
        String color = scanner.next();
        samochód.setColour(color);
        boolean test = true;
        do {
            System.out.println("Podaj cene samochodu: ");
            try {
                scanner.nextLine();
                int cena = scanner.nextInt();
                samochód.setPrice(cena);
                test = false;

            } catch (InputMismatchException e) {
                System.out.println("Podałem zły znak ** SPROBUJ PONOWNIE **");
            }
        } while (test);

        System.out.println("Podaj ilość drzwi: ");
        // int drzwi = scanner.nextInt();
        samochód.setDoor(scanner.nextInt());  // SKRÓCONY ZAPIS

        System.out.println("Podaj marke samochodu: ");
        String marka = scanner.next();
        samochód.setMark(marka);

        System.out.println("Podaj rocznik auta: ");
        samochód.setYearbook(scanner.nextInt()); // SKRÓCONY ZAPIS
        myList.add(samochód);
    }
}
