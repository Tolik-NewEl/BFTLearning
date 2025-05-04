import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public static <T> Collection<T> filterCollection(Collection<T> collection, Predicate<T> predicate) {
        Collection<T> filtered = new ArrayList<>();
        for (T element : collection) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}