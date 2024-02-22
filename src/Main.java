import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<IForme> formes = new ArrayList<>();
        formes.add(new Cercle(3));
        formes.add(new Rectangle(2, 3));
        formes.add(new Triangle(2, 3));
        formes.add(new Square(3));


        Collections.sort(formes, new CompareTo()  );

        for (IForme forme : formes) {
            System.out.println(forme.surface());
        }


    }
}