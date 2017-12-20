package main;

import beans.Course;
import beans.Lection;
import beans.Lecturer;
import facade.Facade;

public class Main {
    public static Facade facade = new Facade();

    public static void main(String[] args) throws Exception {

        //Read
        facade.getManagerOfCourse().readFromFile();
        facade.getManagerOfLecturer().readFromFile();
        facade.getManagerOfLection().readFromFile();
        facade.getManagerOfStudent().readFromFile();

        //Print
        for(Course course : facade.getManagerOfCourse().getAllCourses()){
            if(course!=null)
            System.out.println(course.toPrint());
        }

        /*facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Vasya"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));
        facade.getManagerOfStudent().addStudent(new Student("Kirill"));*/

        /*for (int i = 0; i < facade.getManagerOfStudent().getAllStudents().length; i++) {
            if (facade.getManagerOfStudent().getAllStudents()[i] != null)
                System.out.println(facade.getManagerOfStudent().getAllStudents()[i].getId());
        }*/
        //facade.getManagerOfStudent().removeStudent(2);

/*

        System.out.println(facade.getManagerOfStudent().getAllStudents().length);
        //facade.writeStudentToFile();

        facade.getManagerOfStudent().readFromFile();
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
        facade.getManagerOfCourse().getAllCourses()[0].setIdLecturerOfCourse(0);
        //facade.getManagerOfLecturer().addLecturer(new Lecturer("Gena"));
        facade.getManagerOfLecturer().writeToFile();


        for (Lecturer lecturer: facade.getManagerOfLecturer().getAllLecturer())
        {
            if(lecturer!=null)
            System.out.println(lecturer.toString());
            else System.out.println("null");
        }
        facade.getManagerOfLecturer().readFromFile();
        for (Lecturer lecturer: facade.getManagerOfLecturer().getAllLecturer())
        {
            if(lecturer!=null)
            System.out.println(lecturer.toString());
        }  //LECTURER!!! READ FROM FILE

        */
/*facade.getManagerOfLection().addLection(new Lection("Circles", "17.08.2017 11:12"));
        facade.getManagerOfLection().writeToFile();*//*

        for (Lection lection: facade.getManagerOfLection().getAllLection())
        {
            if(lection!=null)
                System.out.println(lection.toString());
            else System.out.println("null");
        }
        facade.getManagerOfLection().readFromFile();
        for (Lection lection: facade.getManagerOfLection().getAllLection())
        {
            if(lection!=null)
                System.out.println(lection.toString());
        }
*/



        /*System.out.println(facade.getManagerOfCourse().getAllCourses()[0].toString());
        System.out.println(facade.getManagerOfLecturer().getLecturerById(1).toString());*/


    }
}
