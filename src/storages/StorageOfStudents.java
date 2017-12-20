package storages;

import beans.Student;
import com.danco.training.TextFileWorker;
import main.Main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class StorageOfStudents {
    private Student[] allStudents = new Student[10];
    private int lastId;


    public Student[] getAllStudents() {
        return allStudents;
    }

    public int getNumberOfStudents() {
        int numberOfStudents = 0;
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] != null)
                numberOfStudents++;
        }
        return numberOfStudents;
    }


    public void addStudent(Student student) {
        boolean check = false;
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            allStudents = Arrays.copyOf(allStudents, allStudents.length * 2);
        }

        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] == null) {
                allStudents[i] = student;
                allStudents[i].setId(this.lastId + 1);
                this.lastId = allStudents[i].getId();
                break;
            }

        }
    }

    public void writeToFile() throws Exception {
        final String TEST = "d:/java-SENLA/src/students.txt";
        Path filepath = Paths.get(TEST);
        //Files.createFile(filepath);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] studentsStringArray = new String[allStudents.length];
        for (int i = 0; i < studentsStringArray.length; i++) {
            if (allStudents[i] != null) studentsStringArray[i] = allStudents[i].toString();
        }
        fileWorker.writeToFile(studentsStringArray);
        /**/
    }

    public void readFromFile() {
        final String TEST = "d:/java-SENLA/src/students.txt";
        Path filepath = Paths.get(TEST);

        TextFileWorker fileWorker = new TextFileWorker(TEST);
        String[] students = fileWorker.readFromFile();

        for (int i = 0; i < students.length; i++) {
            if (!students[i].equals("null")) {

                String[] arr = students[i].trim().split(" ");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                int idCourse = Integer.parseInt(arr[2]);

                for (int j = 0; j < allStudents.length; j++) {
                    if (allStudents[j] == null) {
                        allStudents[j] = new Student(id, name, idCourse);
                        break;
                    }
                }
            }
        }
        for (Student student : allStudents) {
            if (student != null)
                Main.facade.getManagerOfCourse().getCourseById(student.getIdCourse()).addStudentsOfCourse(student);
        }
    }


    public void removeStudent(int id) {
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] != null && allStudents[i].getId() == id) {
                allStudents[i] = null;

            }
        }

    }
}
