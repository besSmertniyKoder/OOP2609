import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Animal frog = new Frog();
        Animal capy = new Capybara();
        frog.voice();
        capy.voice();

        frog.setName("frog1");
        System.out.println(frog.getName());
        capy.setName("capy1");
        System.out.println(capy.getName());
        capy.feed();
        capy.clean();
        frog.feed();
        frog.clean();
        capy.info();
        frog.info();
    }
}