package storages;

import beans.Course;
import com.danco.training.TextFileWorker;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class StorageOfCourse {
    private Course[] allCourse = new Course[10];
    private int lastId;

    public Course[] getAllCourses() {
        return allCourse;
    }


    public int getNumberOfCourses() {

        int numberOfCourses = 0;
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] != null)
                numberOfCourses++;
        }
        return numberOfCourses;
    }

    public void writeToFile() throws Exception {
        final String TEST = "d:/course.txt";
        Path filepath = Paths.get(TEST);
        Files.createFile(filepath);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] courseStringArray = new String[allCourse.length];
        for (int i = 0; i < courseStringArray.length; i++) {
            if (allCourse[i] != null) courseStringArray[i] = allCourse[i].toString();
        }
        fileWorker.writeToFile(courseStringArray);
        /**/
    }

    public void readFromFile() {
        final String TEST = "d:/course.txt";
        Path filepath = Paths.get(TEST);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        Object[] readedValues = fileWorker.readFromFile();
        for (int i = 0; i < readedValues.length; i++)
            System.out.println(readedValues[i].toString());

    }

    public void addCourse(Course course) {
        boolean check = false;
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            allCourse = Arrays.copyOf(allCourse, allCourse.length * 2);
        }
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] == null) {
                allCourse[i] = course;
                allCourse[i].setId(this.lastId + 1);
                this.lastId = allCourse[i].getId();
                break;
            }
        }
    }

    public void removeCourse(int id) {
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] != null && allCourse[i].getId() == id) {
                allCourse[i] = null;
            }
        }

    }
}
