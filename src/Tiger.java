public class Tiger extends Animal{
    public Tiger(String name, String color){
        super(name, color, 4);
    }
    public Tiger(String color){
        super(null, color, 4);
    }

    @Override
    public void toFly() {
        System.out.println("Тигры только учатся летать))))");
    }

    @Override
    public void speak() {
        System.out.println("РРррРррРрРР........");
    }
}
