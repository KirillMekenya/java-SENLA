package managers;

import beans.Student;
import comparator.StudentByNameComparator;
import storages.StorageOfStudents;

import java.util.Arrays;

public class ManagerOfStudent {
    private StorageOfStudents storageOfStudents;

    public ManagerOfStudent() {
        storageOfStudents = new StorageOfStudents();
    }

    public Student getStudentById(int id) {
        Student rStudent = null;
        for (Student student : storageOfStudents.getAllStudents()) {
            if (student != null) {

                if (student.getId() == id) {
                    rStudent = student;
                }
            }
        }
        return rStudent;
    }

    public Student[] getAllStudents() {
        return storageOfStudents.getAllStudents();
    }

    public void writeToFile() throws Exception {
        storageOfStudents.writeToFile();
    }

    public void readFromFile() {
        storageOfStudents.readFromFile();
    }

    public int getNumberOfStudents() {
        return storageOfStudents.getNumberOfStudents();
    }

    public void addStudent(Student student) {
        storageOfStudents.addStudent(student);
    }

    public void removeStudent(int id) {
        storageOfStudents.removeStudent(id);
    }

    public Student[] sortByName() {
        Student[] temp = getAllStudents();
        Arrays.sort(temp, new StudentByNameComparator());
        return temp;
    }
}
