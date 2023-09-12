package Domen;

import java.util.Iterator;
import java.util.List;
/**
 * Итератор для класса StudentSteam
 */
public class SteamIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> steam;

    
    public SteamIterator(List<StudentGroup> group) {
        this.steam = group;
    }

    @Override
    public boolean hasNext() {
        return counter < steam.size();
    }

    @Override
    public StudentGroup next() {
        counter++;
        return steam.get(counter - 1);
    }

}
