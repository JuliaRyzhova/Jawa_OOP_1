import impl.Illable;
import impl.Runnable;
import impl.Speakable;
import impl.Swimable;
import parent.Animal;

public class Tiger extends Animal implements Runnable, Swimable, Illable, Speakable {
    public Tiger(String name, String color) {
        super(name, color, 4);
    }

    public Tiger(String name) {
        super(name, null, 4);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("РРррРррРрРР........");
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 30;
    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
