package task3;

import task3.interfaces.Shape;
/**
 * Класс для создания груга
 */
public class Circle implements Shape {
    private double radius;

    /**
     * @param radius круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    }
