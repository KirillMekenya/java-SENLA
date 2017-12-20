package storages;

import beans.Course;
import beans.Lection;
import beans.Lecturer;
import com.danco.training.TextFileWorker;
import main.Main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StorageOfLectures {
    private Lecturer[] allLecturer = new Lecturer[10];
    private int lastId;

    public Lecturer[] getAllLecturer() {
        return allLecturer;
    }

    public int getNumberOfLecturers() {
        int numberOfLecturers = 0;
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null)
                numberOfLecturers++;
        }
        return numberOfLecturers;
    }
    public void writeToFile() throws Exception {
        final String TEST = "d:/java-SENLA/src/lecturers.txt";
        Path filepath = Paths.get(TEST);
        //Files.createFile(filepath);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] lecturersStringArray = new String[allLecturer.length];
        for (int i = 0; i < lecturersStringArray.length; i++) {
            if (allLecturer[i] != null) lecturersStringArray[i] = allLecturer[i].toString();
        }
        fileWorker.writeToFile(lecturersStringArray);
        /**/
    }
    public void readFromFile() throws Exception{
        final String TEST = "d:/java-SENLA/src/lecturers.txt";
        Path filepath = Paths.get(TEST);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] lecturers = fileWorker.readFromFile();

        for (int i = 0; i < lecturers.length; i++) {
            if (!lecturers[i].equals("null") ) {

                String[] arr = lecturers[i].trim().split(" ");
                int idLecturer = Integer.parseInt(arr[0]);
                String name = arr[1];
                int idCourse = Integer.parseInt(arr[2]);


                for (int j = 0; j < allLecturer.length; j++) {
                    if (allLecturer[j] == null) {
                        allLecturer[j] = new Lecturer(name);
                        allLecturer[j].setId(idLecturer);
                        allLecturer[j].setCourseId(idCourse);
                        break;
                    }
                }
            }
        }
        for(Lecturer lecturer : allLecturer){
            if(lecturer!=null)
            Main.facade.getManagerOfCourse().getCourseById(lecturer.getCourseId()).setIdLecturerOfCourse(lecturer.getId());
        }

    }

    public void addLecturer(Lecturer lecturer) {
        boolean check = false;
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            allLecturer = Arrays.copyOf(allLecturer, allLecturer.length * 2);
        }
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] == null) {
                allLecturer[i] = lecturer;
                allLecturer[i].setId(this.lastId + 1);
                this.lastId = allLecturer[i].getId();
                break;
            }
        }
    }

    public void removeLecturer(int id) {
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null && allLecturer[i].getId() == id) {
                allLecturer[i] = null;
            }
        }

    }
}
