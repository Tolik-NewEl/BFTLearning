import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoxChecking {

    public static void main(String[] args) {

        ArrayList<Box> boxesList = new ArrayList<>(List.of(
                new Box(20,30,40),
                new Box(31,30,29),
                new Box(40,10,10),
                new Box(35,30,30),
                new Box(30,30,30)
        ));

        Collection<Box> filtered = Box.filterCollection(boxesList, e -> e.getWidth() > 30.0);

        System.out.println(filtered);
    }
}