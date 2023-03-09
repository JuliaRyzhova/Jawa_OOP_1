import impl.Flyable;
import impl.Illable;
import parent.Animal;

public class Butterfly extends Animal implements Flyable, Illable {
    public Butterfly(String name, String color) {
        super(name, color, 0);
    }

    public Butterfly(String name) {
        super(name, null, 0);
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
