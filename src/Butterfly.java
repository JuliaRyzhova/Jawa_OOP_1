public class Butterfly extends Animal{
    public Butterfly(String name, String color){
        super(name, color, 0);
    }
    public Butterfly(String color){
        super(null, color, 0);
    }

    @Override
    public void toFly() {
        System.out.println("Бабочка летит!");
    }

    @Override
    public void toGo() {
        toFly();
    }

    @Override
    public void toSwim() {
        System.out.println("Бабочки не умеют плавать!");
    }

    @Override
    public void speak() {
        System.out.println("Бабочки, к сожалению, пока не научились разговаривать!");
    }

    @Override
    public void hunt() {
        System.out.println("Бабочки не умеют охотиться!");
    }
}
