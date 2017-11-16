package managers;

import beans.Lection;
import comparator.LectionDateComparator;
import comparator.LectionNameComparator;
import storages.StorageOfLections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class ManagerOfLection {
    private StorageOfLections storageOfLections;

    public ManagerOfLection() {
        storageOfLections = new StorageOfLections();
    }

    public Lection[] getAllLection() {
        return storageOfLections.getAllLection();
    }

    public void addLection(Lection lection) {
        storageOfLections.addLection(lection);
    }

    public Lection getStudentById(int id) {
        Lection rLection = null;
        for (Lection lection : storageOfLections.getAllLection()) {
            if (lection != null) {

                if (lection.getId() == id) {
                    rLection = lection;
                }
            }
        }
        return rLection;
    }

    public void lectionsOnDate(String dateString) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = dateFormat.parse(dateString);
        Lection[] tempLection = new Lection[10];
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date);
        calendar.add(Calendar.DATE, 1);

        for (int i = 0; i < storageOfLections.getAllLection().length; i++) {
            if (storageOfLections.getAllLection()[i] != null) {

                if (storageOfLections.getAllLection()[i].getDate().after(calendar1.getTime()) && storageOfLections.getAllLection()[i].getDate().before(calendar.getTime())) {
                    tempLection[i] = storageOfLections.getAllLection()[i];
                    System.out.println(storageOfLections.getAllLection()[i].getNameOfLection());
                }
            }

        }
    }

    public void removeLection(int id) {
        storageOfLections.removeLection(id);
    }

    public Lection[] sortByName() {
        Lection[] temp = getAllLection();
        Arrays.sort(temp, new LectionNameComparator());
        return temp;
    }

    public Lection[] sortByDate() {
        Lection[] temp = getAllLection();
        Arrays.sort(temp, new LectionDateComparator());
        return temp;
    }
}
