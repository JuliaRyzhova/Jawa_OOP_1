public class Fish extends Animal{
    public Fish(String name, String color){
        super(name, color, 0);
    }
    public Fish(String color){
        super(null, color, 0);
    }

    @Override
    public void toFly() {
        System.out.println("Рыбы не умеют летать");
    }

    @Override
    public void toGo() {
        System.out.println("Рыбы не умеют ходить");
    }

    @Override
    public void speak() {
        System.out.println("Рыбы не умеют разговаривать");
    }
}
