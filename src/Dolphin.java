public class Dolphin extends Animal{
    public Dolphin(String name, String color){
        super(name, color, 0);
    }
    public Dolphin(String color){
        super(null, color, 0);
    }

    @Override
    public void speak() {
        System.out.println("Здесь писклявый ультразвук не поддающийся описанию");
    }

    @Override
    public void hunt() {
        System.out.println("Дельфины настолько милые, что не умеют охотиться");
    }

    @Override
    public void toFly() {
        System.out.println("Дельфины пока не научились летать");
    }

    @Override
    public void toGo() {
        System.out.println("Дельфины могут только плавать");
    }
}
