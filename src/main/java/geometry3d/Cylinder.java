package geometry3d;

import exceptions.InvalidFigureException;
import exceptions.NegativeDimensionException;
import geometry2d.Figure;

/**
 * Класс, представляющий цилиндр.
 */
public class Cylinder {
    private final Figure base;   // Основание цилиндра (фигура)
    private final double height; // Высота цилиндра

    // Конструктор класса Cylinder
    public Cylinder(Figure base, double height) throws InvalidFigureException, NegativeDimensionException {
        if (base == null) {
            throw new InvalidFigureException("Base figure cannot be null");
        }
        if (height <= 0) {
            throw new NegativeDimensionException("Height must be positive");
        }
        this.base = base;
        this.height = height;
    }

    // Метод для вычисления объема цилиндра
    public double volume() {
        return base.area() * height; // Объем цилиндра
    }

    @Override
    public String toString() {
        return "Cylinder: base=" + base + ", height=" + height + ", volume=" + volume();
    }
}
