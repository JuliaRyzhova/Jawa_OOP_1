import classesAnimal.*;
import classesHuman.Doctor;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Goose("Петруха"))
                .addAnimal(new Fish("Ася"))
                .addAnimal(new Butterfly("Мила"))
                .addAnimal(new Deer("Джо"))
                .addAnimal(new Tiger("Хэдж"))
                .addAnimal(new Dolphin("Скуби"));

        System.out.println("Flying animals: " + vetClinic.getFlyable());
        System.out.println("Running animals: " + vetClinic.getRunable());
        System.out.println("Swimming animals: " + vetClinic.getSwimable());
        System.out.println(("Speaking animals: " + vetClinic.getSpeakable()));
        System.out.println("All animals in Clinic: " + vetClinic.getAnimals());

        System.out.println();

        Doctor merlova = new Doctor("Мерлова Ирина Витальевна", "Ветеринарный врач");
        Doctor surikov = new Doctor("Суриков Иван Игоревич", "Ветеринарный врач");
        Doctor belova = new Doctor("Белова Ольга Михайлова", "Ветеринарный врач");
        Doctor shpakov = new Doctor("Шпаков Олег Альбертович", "Хирург");

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(merlova);
        doctors.add(surikov);
        doctors.add(belova);
        doctors.add(shpakov);

        System.out.println(doctors);

    }
}