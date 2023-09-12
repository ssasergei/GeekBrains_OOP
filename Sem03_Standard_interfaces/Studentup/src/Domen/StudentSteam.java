package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterator<StudentGroup> {
    /**
     * список групп
     */
    private List<StudentGroup> steam;
    /**
     * номер потока
     */
    private int steamId;
    /**
     * Размер потока
     */
    private int streamSize;

    /**
     * @param steam   - список потока
     * @param steamId - номер потока
     */
    public StudentSteam(List<StudentGroup> steam, int steamId) {
        this.steam = steam;
        this.steamId = steamId;
        this.streamSize= steam.size();
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public int getSteamId() {
        return steamId;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    public int getStreamSize() {
        return streamSize;
    }

/**
 * Вывод информации о потоке
 */

    @Override
    public String toString() {
        String groupOut = "StudentSteam [Номер потока =" + steamId + ", Размер потока=" + streamSize + "\n\n";
        for (StudentGroup group : steam){
            groupOut +=group + "\n";
        }
        return groupOut;
    }

    // @Override
    // public Iterator<StudentGroup> iterator() {
    // return new SteamIterator(steam);
    // }
    
    /**
     * Проблема с итератором не работает приходится писать код  отдельно   
     */    


    private int counter;

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
