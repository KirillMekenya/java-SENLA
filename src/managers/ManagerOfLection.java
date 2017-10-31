package managers;

import beans.Lection;
import storages.StorageOfLections;

import java.util.Arrays;

public class ManagerOfLection {
    private StorageOfLections storageOfLections;

    public ManagerOfLection()
    {
        storageOfLections =new StorageOfLections();
    }

    public Lection[] getAllLection() {
        return storageOfLections.getAllLection();
    }

    public void addLection(Lection lection) {
        storageOfLections.addLection(lection);
    }

    public void removeLection(String nameOfLection) {
        storageOfLections.removeLection(nameOfLection);
    }
    public Lection[] sortByName(){
        Lection[] temp = getAllLection();
        Arrays.sort(temp,Lection.SortByName);
        return temp;
    }
    public Lection[] sortByDate(){
        Lection[] temp = getAllLection();
        Arrays.sort(temp, Lection.SortByDate);
        return temp;
    }
}
