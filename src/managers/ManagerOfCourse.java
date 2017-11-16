package managers;

import beans.Course;
import comparator.DateOfStartComparator;
import comparator.LecturerComparator;
import comparator.NameComparator;
import comparator.NumberOfStudentsComparator;
import storages.StorageOfCourse;

import java.util.Arrays;

public class ManagerOfCourse {
    private StorageOfCourse storageOfCourse;

    public ManagerOfCourse() {
        storageOfCourse = new StorageOfCourse();
    }

    public Course[] getAllCourses() {
        return storageOfCourse.getAllCourses();
    }

    public int getNumberOfCourse() {
        return storageOfCourse.getNumberOfCourses();
    }

    public void addCourse(Course course) {
        storageOfCourse.addCourse(course);
    }

    public void removeCourse(int id) {
        storageOfCourse.removeCourse(id);
    }

    public void writeToFile() throws Exception {
        storageOfCourse.writeToFile();
    }

    public void readFromFile() {
        storageOfCourse.readFromFile();
    }

    public Course getStudentById(int id) {
        Course rCourse = null;
        for (Course course : storageOfCourse.getAllCourses()) {
            if (course != null) {

                if (course.getId() == id) {
                    rCourse = course;
                }
            }
        }
        return rCourse;
    }

    public Course[] sortByLecturer() {
        Course[] temp = getAllCourses();
        Arrays.sort(temp, new LecturerComparator());
        return temp;
    }

    public Course[] sortByName() {
        Course[] temp = getAllCourses();
        Arrays.sort(temp, new NameComparator());
        return temp;
    }

    public Course[] sortByDateOfStart() {
        Course[] temp = getAllCourses();
        Arrays.sort(temp, new DateOfStartComparator());
        return temp;
    }

    public Course[] sortByNumberOfStudents() {
        Course[] temp = getAllCourses();
        Arrays.sort(temp, new NumberOfStudentsComparator());
        return temp;
    }

}
