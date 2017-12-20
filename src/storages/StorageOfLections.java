package storages;

import beans.Lection;
import com.danco.training.TextFileWorker;
import main.Main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StorageOfLections {
    private Lection[] allLection = new Lection[10];
    private int lastId;


    public Lection[] getAllLection() {
        return allLection;
    }

    public void addLection(Lection lection) {
        boolean check = false;
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            allLection = Arrays.copyOf(allLection, allLection.length * 2);
        }
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] == null) {
                allLection[i] = lection;
                allLection[i].setId(this.lastId + 1);
                this.lastId = allLection[i].getId();
                break;
            }
        }
    }

    public void writeToFile() throws Exception {
        final String TEST = "d:/java-SENLA/src/lections.txt";
        Path filepath = Paths.get(TEST);
        Files.createFile(filepath);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] lectionsStringArray = new String[allLection.length];
        for (int i = 0; i < lectionsStringArray.length; i++) {
            if (allLection[i] != null) lectionsStringArray[i] = allLection[i].toString();
        }
        fileWorker.writeToFile(lectionsStringArray);
        /**/
    }

    public void readFromFile() throws Exception {
        final String TEST = "d:/java-SENLA/src/lections.txt";
        Path filepath = Paths.get(TEST);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] lections = fileWorker.readFromFile();

        for (int i = 0; i < lections.length; i++) {
            if (!lections[i].equals("null")) {

                String[] arr = lections[i].trim().split(" ");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                SimpleDateFormat format = new SimpleDateFormat();
                format.applyPattern("dd.MM.yyyy-HH:mm");
                Date date = format.parse(arr[2]);
                int idCourse = Integer.parseInt(arr[3]);


                for (int j = 0; j < allLection.length; j++) {
                    if (allLection[j] == null) {
                        allLection[j] = new Lection(id, name, date, idCourse);
                        break;
                    }
                }
            }


        }

        for (Lection lection : allLection) {
            if (lection != null)
                Main.facade.getManagerOfCourse().getCourseById(lection.getIdCourse()).addLectionOfCourse(lection);
        }

    }

    public void removeLection(int id) {
        for (int i = 0; i < allLection.length; i++) {
            if (allLection[i] != null && allLection[i].getId() == id) {
                allLection[i] = null;
            }
        }

    }
}

