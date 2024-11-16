package geometry2d;

import exceptions.NegativeDimensionException;

/**
 * Класс, представляющий круг.
 */
public class Circle implements Figure {
    private final double radius; // Радиус круга

    // Конструктор класса Circle
    public Circle(double radius) throws NegativeDimensionException {
        if (radius <= 0) {
            throw new NegativeDimensionException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Площадь круга
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Периметр круга
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter();
    }
}
