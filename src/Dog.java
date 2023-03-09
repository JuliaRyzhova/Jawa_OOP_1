import impl.Illable;
import impl.Speakable;
import parent.Animal;

public class Dog extends Animal implements Runnable, Illable, Speakable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void getIll() {

    }

    @Override
    public void run() {

    }
}
