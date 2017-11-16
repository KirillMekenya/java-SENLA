package storages;

import beans.Lection;

import java.util.Arrays;

public class StorageOfLections {
    private Lection[] allLection = new Lection[10];
    private int lastId;


    public Lection[] getAllLection() {
        return allLection;
    }

    public void addLection(Lection lection) {
        boolean check=false;
        for(int i = 0; i< allLection.length; i++)
        {
            if(allLection[i]==null)
            {
                check=true;
                break;
            }
        }

        if(check==false)
        {
            allLection= Arrays.copyOf(allLection, allLection.length*2);
        }
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] == null){
                allLection[i] = lection;
                allLection[i].setId(this.lastId + 1);
                this.lastId = allLection[i].getId();
            break;}
        }
    }

    public void removeLection(int id) {
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] != null && allLection[i].getId()==id) {
                allLection[i] = null;
            }
        }

    }
}

