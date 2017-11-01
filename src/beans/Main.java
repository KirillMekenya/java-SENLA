package beans;

import facade.Facade;
import managers.ManagerOfCourse;
import managers.ManagerOfLection;
import managers.ManagerOfLecturer;
import managers.ManagerOfStudent;
import storages.StorageOfCourse;
import storages.StorageOfLections;
import storages.StorageOfLectures;
import storages.StorageOfStudents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getManagerOfCourse().addCourse(new Course("Programming","01.10.2017 10:00", "01.05.2018 11:00"));
        facade.getManagerOfCourse().addCourse(new Course("Database","01.08.2017 17:00", "03.07.2018 16:00"));
        facade.getManagerOfCourse().getAllCourses()[0].addStudentsOfCourse(new Student("Kirill"));
        facade.getManagerOfCourse().getAllCourses()[0].addStudentsOfCourse(new Student("Vasya"));
        facade.printCourseSortByDateOfStart();
        System.out.println("**************");
        facade.printCourseSortByNumberOfStudent();
        System.out.println("**************");
        facade.getManagerOfStudent().addStudent(new Student("Petya"));
        facade.getManagerOfStudent().addStudent(new Student("Alik"));
        facade.printSortStudentsByName();
        System.out.println("**************");
        facade.getManagerOfLecturer().addLecturer(new Lecturer("Vasiliy Gemad'evich"));
        facade.getManagerOfLecturer().getAllLecturer()[0].setCourse(new Course("PHP","10.10.2017", "10.12.2017"));
        facade.getManagerOfLecturer().addLecturer(new Lecturer("Ivan Petrovich"));
        facade.getManagerOfLecturer().getAllLecturer()[1].setCourse(new Course("SQL","10.10.2017", "10.12.2017"));
        facade.printSortLecturerByName();



        ManagerOfStudent managerOfStudent = new ManagerOfStudent();
        ManagerOfLection managerOfLection = new ManagerOfLection();
        ManagerOfLecturer managerOfLecturer = new ManagerOfLecturer();
        ManagerOfCourse managerOfCourse = new ManagerOfCourse();
        managerOfLection.addLection(new Lection("Java", "12.10.2017 10:00"));
        managerOfLection.addLection(new Lection("C++", "13.10.2017 13:00"));
        managerOfLection.addLection(new Lection("JavaSE", "08.10.2017 11:00"));
        managerOfLection.addLection(new Lection("Java!!", "08.10.2017 13:00"));
        managerOfLection.lectionsOnDate("08.10.2017");
        for( Lection lection: managerOfLection.getAllLection())
        {
            if(lection!= null)
                System.out.println(lection.getNameOfLection()+" "+lection.getDate());
        }
        managerOfLection.sortByName();
        System.out.println("*************************");
        for( Lection lection: managerOfLection.getAllLection())
        {
            if(lection!= null)
                System.out.println(lection.getNameOfLection()+" "+lection.getDate());
        }
        System.out.println("*************************");
        managerOfLection.sortByDate();
        for( Lection lection: managerOfLection.getAllLection())
        {
            if(lection!= null)
                System.out.println(lection.getNameOfLection()+" "+lection.getDate());
        }
        managerOfLecturer.addLecturer(new Lecturer("Petr Vasilievich"));
        managerOfLecturer.addLecturer(new Lecturer("Adolf Petrovich"));

        System.out.println("*************************");
        for( Lecturer lecturer: managerOfLecturer.getAllLecturer())
        {
            if(lecturer!= null)
                System.out.println(lecturer.getNameOfLecturer());
        }
        System.out.println("*************************");
        managerOfLecturer.sortByName();
        for( Lecturer lecturer: managerOfLecturer.getAllLecturer())
        {
            if(lecturer!= null)
                System.out.println(lecturer.getNameOfLecturer());
        }
        System.out.println("*************************");
        managerOfCourse.addCourse(new Course("Programming","01.10.2017 10:00", "01.05.2018 11:00"));
        managerOfCourse.addCourse(new Course("Database","01.08.2017 17:00", "03.07.2018 16:00"));
        for( Course course: managerOfCourse.getAllCourses())
        {
            if(course!= null)
                System.out.println(course.getNameOfCourse());
        }

        System.out.println("*************************");
        managerOfCourse.sortByName();
        for( Course course: managerOfCourse.getAllCourses())
        {
            if(course!= null)
                System.out.println(course.getNameOfCourse());
        }
        System.out.println("*************************");
        managerOfCourse.sortByDateOfStart();
        for( Course course: managerOfCourse.getAllCourses())
        {
            if(course!= null)
                System.out.println(course.getNameOfCourse());
        }
        System.out.println("*************************");
       /* for( Course course: managerOfCourse.getAllCourses())
        {
            if(course!= null)
                System.out.println(course.getNameOfCourse());
        }
        System.out.println("*************************");
       // managerOfCourse.sortByNumberOfStudents();
        managerOfCourse.getAllCourses()[0].addStudentsOfCourse(new Student("Kirill"));
        managerOfCourse.getAllCourses()[0].addStudentsOfCourse(new Student("Vasya"));
        managerOfCourse.getAllCourses()[0].addStudentsOfCourse(new Student("Petya"));
        managerOfCourse.getAllCourses()[1].addStudentsOfCourse(new Student("Katya"));
        for( Course course: managerOfCourse.getAllCourses())
        {
            if(course!= null)
                System.out.println(course.getNameOfCourse());
        }*/
        System.out.println("Courses number "+managerOfCourse.getNumberOfCourse());
        System.out.println("Lectures number "+managerOfLecturer.getNumberOfLecturers());
        System.out.println("Students number "+managerOfStudent.getNumberOfStudents());


        /*StorageOfLectures storageOfLectures = new StorageOfLectures();
        StorageOfCourse storageOfCourse = new StorageOfCourse();
        Course course = new Course();
        Student [] studentsToNewCourse = new Student[12];
        for(int i = 0; i<studentsToNewCourse.length;i++){
            studentsToNewCourse[i] = managerOfStudent.getAllStudents()[new Random().nextInt(managerOfStudent.getAllStudents().length)];
        }
        course.setStudentsOfCourse(studentsToNewCourse);
        storageOfCourse.addCourse(course);

        StorageOfLections storageOfLections = new StorageOfLections();
        for (Student studentTemp : managerOfStudent.getAllStudents()) {
            if (studentTemp != null) System.out.println(studentTemp.getNameOfStudent());
        }
        System.out.println("************************");


        managerOfStudent.sortByName();
        for (Student studentTemp : managerOfStudent.getAllStudents()) {
            if (studentTemp != null) System.out.println(studentTemp.toString());
        }

        System.out.println("************************");

        managerOfStudent.removeStudent("Volodya");
        for (Student studentTemp : managerOfStudent.getAllStudents()) {
            if (studentTemp != null) System.out.println(studentTemp.getNameOfStudent());
        }*/
    }
}
