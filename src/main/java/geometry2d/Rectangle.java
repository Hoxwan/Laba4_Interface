package geometry2d;

import exceptions.NegativeDimensionException;

/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle implements Figure {
    private final double width;  // Ширина прямоугольника
    private final double height; // Высота прямоугольника

    // Конструктор класса Rectangle
    public Rectangle(double width, double height) throws NegativeDimensionException {
        if (width <= 0 || height <= 0) {
            throw new NegativeDimensionException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Площадь прямоугольника
    }

    @Override
    public double perimeter() {
        return 2 * (width + height); // Периметр прямоугольника
    }

    @Override
    public String toString() {
        return "Rectangle: width=" + width + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter();
    }
}
