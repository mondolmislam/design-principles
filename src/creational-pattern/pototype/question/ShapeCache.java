package pototype.question;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // For each shape run a database query and create shape
    // shapeMap.put(shapeKey, shape);
    // For example, adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangular rectangle = new Rectangular();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
