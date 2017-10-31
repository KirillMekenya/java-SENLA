package managers;

import beans.Course;
import storages.StorageOfCourse;

import java.util.Arrays;

public class ManagerOfCourse {
    private StorageOfCourse storageOfCourse;

    public ManagerOfCourse()
    {
        storageOfCourse =new StorageOfCourse();
    }

    public Course[] getAllCourses() {
        return storageOfCourse.getAllCourses();
    }
    public int getNumberOfCourse(){
        return storageOfCourse.getNumberOfCourses();
    }

    public void addCourse(Course course) {
        storageOfCourse.addCourse(course);
    }

    public void removeCourse(String nameOfCourse) {
        storageOfCourse.removeCourse(nameOfCourse);
    }
    public Course[] sortByName(){
        Course[] temp = getAllCourses();
        Arrays.sort(temp,Course.SortByName);
        return temp;
    }
    public Course[] sortByDateOfStart(){
        Course[] temp = getAllCourses();
        Arrays.sort(temp, Course.SortByDateOfStart);
        return temp;
    }
    public Course[] sortByNumberOfStudents(){
        Course[] temp = getAllCourses();
        Arrays.sort(temp, Course.SortByNumbersOfStudent);
        return temp;
    }

}
