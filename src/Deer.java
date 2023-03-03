public class Deer extends Animal{
    public Deer(String name, String color){
        super(name, color, 4);
    }
    public Deer(String color){
        super(null, color, 4);
    }

    @Override
    public void toFly() {
        System.out.println("Олени не умеют летать");
    }

    @Override
    public void hunt() {
        System.out.println("Олени - растительноядные животные");
    }

    @Override
    public void speak() {
        System.out.println("Прокричал что-то на оленьем");
    }
}
