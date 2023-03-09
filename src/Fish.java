import impl.Illable;
import impl.Swimable;
import parent.Animal;


public class Fish extends Animal implements Swimable, Illable {
    public Fish(String name, String color) {
        super(name, color, 0);
    }

    public Fish(String name) {
        super(name, null, 0);
    }

    public Fish() {

    }

    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
