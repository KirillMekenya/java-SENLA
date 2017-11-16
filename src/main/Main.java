package main;

import beans.Course;
import beans.Lecturer;
import beans.Student;
import facade.Facade;

public class Main {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Vasya"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));

        for (int i = 0; i < facade.getManagerOfStudent().getAllStudents().length; i++) {
            if (facade.getManagerOfStudent().getAllStudents()[i] != null)
                System.out.println(facade.getManagerOfStudent().getAllStudents()[i].getId());
        }
        facade.getManagerOfStudent().removeStudent(2);


        System.out.println(facade.getManagerOfStudent().getAllStudents().length);
        facade.writeCourseToFile();

        //facade.getManagerOfStudent().readFromFile();
        for (int i = 0; i < facade.getManagerOfStudent().getAllStudents().length; i++) {
            if (facade.getManagerOfStudent().getAllStudents()[i] != null)
                System.out.println(facade.getManagerOfStudent().getAllStudents()[i].toString());
        }


        facade.getManagerOfLecturer().addLecturer(new Lecturer("Alex"));
        facade.getManagerOfCourse().addCourse(new Course());
        facade.getManagerOfCourse().getAllCourses()[0].setNameOfCourse("Programming");
        facade.getManagerOfCourse().getAllCourses()[0].setDateOfStart("10.08.2017 11:00");
        facade.getManagerOfCourse().getAllCourses()[0].setDateOfEnd("10.11.2017 12:10");
        facade.getManagerOfCourse().getAllCourses()[0].addStudentsOfCourse(facade.getManagerOfStudent().getStudentById(2));
        facade.getManagerOfCourse().getAllCourses()[0].setLecturerOfCourse(facade.getManagerOfLecturer().getLecturerById(1));
        System.out.println(facade.getManagerOfCourse().getAllCourses()[0].toString());
        System.out.println(facade.getManagerOfLecturer().getLecturerById(1).toString());


    }
}
