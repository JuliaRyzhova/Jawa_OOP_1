import impl.Illable;
import parent.Animal;
import parent.Human;

public class Deer extends Animal implements Runnable, Illable {
    public Deer(String name, String color){
        super(name, color, 4);
    }
    public Deer(String name){
        super(name, null, 4);
    }

    @Override
    public void run() {

    }

    @Override
    public void getIll() {

    }
}
