package storages;

import beans.Lection;

public class StorageOfLections {
    private Lection[] allLection = new Lection[300];

    public StorageOfLections (){
        allLection = new Lection[300];
    }

    public Lection[] getAllLection() {
        return allLection;
    }

    public void addLection(Lection lection) {
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] == null){
                allLection[i] = lection;
            break;}
        }
    }

    public void removeLection(String lection) {
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] != null && allLection[i].getNameOfLection().equals(lection)) {
                allLection[i] = null;
            }
        }

    }
}

