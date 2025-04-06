public class ShapeDrawing {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
