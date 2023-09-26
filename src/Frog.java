import java.io.Serializable;

public class Frog extends Animal {
    @Override
    public void feed() {
        System.out.println("frog has been feeded");
    }

    @Override
    public void clean() {
        System.out.println("frog has been cleaned");

    }


    @Override
    void voice() {
        System.out.println("kva");
    }

    @Override
    public void info() {
        System.out.println("frog loves to hop/jump");
    }
}
