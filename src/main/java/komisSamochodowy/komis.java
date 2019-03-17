package komisSamochodowy;

import java.util.ArrayList;
import java.util.Scanner;

public class komis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Komis samochodowy!");
        System.out.println("Wybór '1': Dodanie nowego samochodu");
        System.out.println("Wybór '2': Wyświetlanie listy samochodów");
        System.out.println("Wybór '3': Usuwanie wprowadzonych samochodów");
        System.out.println();

        System.out.println("Twój wybór to ?: ");
        int wybor = 0;
        do {
            wybor = scanner.nextInt();
            if (wybor > 0 && wybor < 4) {
                switch (wybor) {
                    case 1:
                        Samochód samochód = new Samochód();
                        System.out.println("Podaj kolor samochodu: ");
                        String color = scanner.next();
                        samochód.setColour(color);

                        System.out.println("Podaj cene samochodu: ");
                        int cena = scanner.nextInt();
                        samochód.setPrice(cena);

                        System.out.println("Podaj ilość drzwi: ");
                        // int drzwi = scanner.nextInt();
                        samochód.setDoor(scanner.nextInt());  // SKRÓCONY ZAPIS

                        System.out.println("Podaj marke samochodu: ");
                        String marka = scanner.next();
                        samochód.setMark(marka);

                        System.out.println("Podaj rocznik auta: ");
                        samochód.setYearbook(scanner.nextInt()); // SKRÓCONY ZAPIS
                        break;
                    case 2:
                        System.out.println("lista samochodów jest pusta !!! zacznij od nowa: ");
                        break;
                    case 3:
                        System.out.println("lista jest pusta zacznij od nowa: ");
                        break;
                }
            } else
                System.out.println("cos jest nie tak!: ");
        } while (wybor < 1 || wybor > 1);

    }
}




