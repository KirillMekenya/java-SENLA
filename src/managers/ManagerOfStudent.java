package managers;

import beans.Student;
import storages.StorageOfStudents;

import java.util.Arrays;

public class ManagerOfStudent {
    private StorageOfStudents storageOfStudents;

    public ManagerOfStudent()
    {
        storageOfStudents = new StorageOfStudents();
    }

    public Student[] getAllStudents() {
        return storageOfStudents.getAllStudents();
    }
    public int getNumberOfStudents(){
        return storageOfStudents.getNumberOfStudents();
    }

    public void addStudent(Student student) {
        storageOfStudents.addStudent(student);
    }

    public void removeStudent(String nameOfStudent) {
        storageOfStudents.removeStudent(nameOfStudent);
    }

    public Student[] sortByName(){
        Student[] temp = getAllStudents();
        Arrays.sort(temp,Student.SortByName);
        return temp;
    }
}
