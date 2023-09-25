package task3;

import task3.interfaces.Shape;
import task3.interfaces.figureVolume;
/**
 * Класс для создания куба
 */
public class cube implements Shape,figureVolume {
    private int edge;

public cube(int edge) {
this.edge = edge;
}

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;

    }
}