package komisSamochodowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class komis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Samochód> myList = new ArrayList<Samochód>();
        do {
            System.out.println("Komis samochodowy!");
            System.out.println("Wybór '1': Dodanie nowego samochodu");
            System.out.println("Wybór '2': Wyświetlanie listy samochodów");
            System.out.println("Wybór '3': Usuwanie wprowadzonych samochodów");
            System.out.println();

            System.out.println("Twój wybór to ?: ");
            Samochód samochód = new Samochód();
            int wybor = scanner.nextInt();
            if (wybor == 1 || wybor == 2 || wybor == 3)
                switch (wybor) {
                    case 1: {
                        DodaneSamochody.dodaneSamochody(myList);
                        break;
                    }
                    case 2: {
                        WyswietlenieListySamochodow.wyswietlenieListySamochodow(myList);
                        break;
                    }
                    case 3: {
                        UsuwanieWprowadzonychSamochodow.usuwanieSamochodow(myList);
                        break;
                    }
                }else
                    System.out.println("Twój wybór poza skalą ** zacznij od nowa **");
                    System.out.println();


        } while (true);
    }
}









