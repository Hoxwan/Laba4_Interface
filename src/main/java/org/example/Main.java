package org.example;

import exceptions.InvalidFigureException;
import exceptions.NegativeDimensionException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) throws NegativeDimensionException, InvalidFigureException {
        // Пример использования классов
        Circle circle = new Circle(5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);

        Cylinder cylinder = new Cylinder(circle, 10);
        System.out.println(cylinder);
    }
}
