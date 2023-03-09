import veterinary.VetClinic;

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

        System.out.println("Flyable animals: " + vetClinic.getFlyable());
        System.out.println("Runnable animals: " + vetClinic.getRunable());
        System.out.println("Swimable animals: " + vetClinic.getSwimable());
        System.out.println(("Speakable animals: " + vetClinic.getSpeakable()));
        System.out.println("All animals in Clinic: " + vetClinic.getAnimals());

    }
}