package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private int counter;
    private List<Student> group;

    public StudentIterator(List<Student> group) {
        this.group = group;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < group.size();
    }

    @Override
    public Student next() {
        // if (!hasNext()) {
        // return null;
        // }
        counter++;
        return group.get(counter - 1);
    }

}
