package storages;

import beans.Course;

public class StorageOfCourse {
    private Course[] allCourse = new Course[300];

    public StorageOfCourse() {

    }

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

    public void addCourse(Course course) {
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] == null) {
                allCourse[i] = course;
                break;
            }
        }
    }

    public void removeCourse(String nameOfCourse) {
        for (int i = 0; i < allCourse.length; i++) {
            if (allCourse[i] != null && allCourse[i].equals(nameOfCourse)) {
                allCourse[i] = null;
            }
        }

    }
}
