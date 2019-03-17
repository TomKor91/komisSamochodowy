package komisSamochodowy;

import java.util.List;

public class WyswietlenieListySamochodow {
    public static void wyswietlenieListySamochodow(List<Samochód> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Twoja lista samochodów: ");
            System.out.println(myList);

        }
        if (myList.isEmpty())
            System.out.println("lista jest pusta zacznij od nowa: ");
        System.out.println();

    }
}

