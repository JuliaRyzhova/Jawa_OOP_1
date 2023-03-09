import impl.Runnable;
import impl.*;
import parent.Animal;

public class Goose extends Animal implements Flyable, Runnable, Swimable, Illable, Speakable {
    public Goose(String name, String color) {
        super(name, color, 2);
    }

    public Goose(String name) {
        super(name, null, 2);
    }


    @Override
    public void speak() {
        System.out.println("Гагагага!!!!");
    }

    @Override
    public int getFlightSpeed() {
        return 6;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
