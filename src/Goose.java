public class Goose extends Animal{
    public Goose(String name, String color){
        super(name, color, 2);
    }
    public Goose(String name){
        super(name, null, 2);
    }

    @Override
    public void toFly() {
        System.out.println("Гусь летит по небу!");
    }

    @Override
    public void toGo() {
        System.out.println("Ходить гуськом - это про нашего гуся");
    }

    @Override
    public void toSwim() {
        System.out.println("Гусь плавает по воде");
    }

    @Override
    public void hunt() {
        System.out.println("Гусь не охотник!");
    }

    @Override
    public void speak() {
        System.out.println("Гагагага!!!!");
    }
}
