package drugs;

import drugs.impl.CatDrug;
import drugs.impl.components.Azitron;
import drugs.impl.components.Penicillin;
import drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1),
                new Azitron("Азитрон", "2", 4));
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Penicillin("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat5 = List.of(new Azitron("Азитрон","4",4),
                new Penicillin("Пинецилин", "20", 6));

        // Создаем лекарства на основе других компонентов

        CatDrug dekhinel = new CatDrug(componentCat, "dekhinel");
        CatDrug astrafarm = new CatDrug(componentCat2, "astrafarm");
        CatDrug novartist = new CatDrug(componentCat2, "novartist");
        CatDrug veltagin = new CatDrug(componentCat3, "veltagin");
        CatDrug siprovet = new CatDrug(componentCat4, "siprovet");
        CatDrug petcam = new CatDrug(componentCat5, "petcam ");

        // Создаем список лекарств
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(dekhinel);
        drugs.add(astrafarm);
        drugs.add(veltagin);
        drugs.add(siprovet);
        drugs.add(petcam);
        drugs.add(novartist);


        Collections.sort(drugs);
        System.out.println("Список лекарств");
        for (CatDrug item: drugs) {
            System.out.println(item);
        }


        System.out.println("Hashcodes componentCat: ");
        for (Component component: componentCat) {
            System.out.println(component.hashCode());
        }

        Set<Component> result = new HashSet<>(componentCat);
        System.out.println(result);
        for (Component res: result
             ) {
            System.out.println(res.hashCode());
        }
    }
}
