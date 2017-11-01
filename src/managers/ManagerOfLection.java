package managers;

import beans.Lection;
import storages.StorageOfLections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

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

    public void lectionsOnDate(String dateString){
        try{

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = dateFormat.parse(dateString);
            Lection[] tempLection = new Lection[300];
            Calendar calendar = Calendar.getInstance();
            Calendar calendar1 = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.HOUR, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            for(int i = 0; i<storageOfLections.getAllLection().length; i++){
                if(storageOfLections.getAllLection()[i]!= null){


                    calendar1.setTime(storageOfLections.getAllLection()[i].getDate());
                    calendar1.set(Calendar.HOUR,-10);
                    calendar1.set(Calendar.MINUTE, 0);
                    calendar1.set(Calendar.SECOND, 0);
                    calendar1.set(Calendar.MILLISECOND, 0);

                    if(calendar.equals(calendar1)){

                        tempLection[i]=storageOfLections.getAllLection()[i];
                        System.out.println(calendar1.getTime());
                    }
                }
                //return tempLection;
            }
        }
        catch (ParseException e){}
        //return storageOfLections.getAllLection();

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
