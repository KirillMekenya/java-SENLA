package facade;

import beans.Course;
import beans.Lecturer;
import beans.Student;
import managers.ManagerOfCourse;
import managers.ManagerOfLection;
import managers.ManagerOfLecturer;
import managers.ManagerOfStudent;

import java.util.Arrays;

public class Facade {


    ManagerOfCourse managerOfCourse;
    ManagerOfLecturer managerOfLecturer;
    ManagerOfLection managerOfLection;
    ManagerOfStudent managerOfStudent;

    public void setManagerOfCourse(ManagerOfCourse managerOfCourse) {
        this.managerOfCourse = managerOfCourse;
    }

    public void setManagerOfLecturer(ManagerOfLecturer managerOfLecturer) {
        this.managerOfLecturer = managerOfLecturer;
    }

    public void setManagerOfLection(ManagerOfLection managerOfLection) {
        this.managerOfLection = managerOfLection;
    }

    public void setManagerOfStudent(ManagerOfStudent managerOfStudent) {
        this.managerOfStudent = managerOfStudent;
    }

    public Facade(){
        managerOfCourse = new ManagerOfCourse();
        managerOfLection = new ManagerOfLection();
        managerOfLecturer = new ManagerOfLecturer();
        managerOfStudent = new ManagerOfStudent();
    }

    public void printCourseSortByDateOfStart(){
        for(Course course : managerOfCourse.sortByDateOfStart())
        {
            if(course!=null)
                System.out.println(course.getNameOfCourse()+" "+course.getDateOfStart());
        }

    }
    public void printSortStudentsByName(){
        for(Student student: managerOfStudent.sortByName())
        {
            if(student!=null)
                System.out.println(student.getNameOfStudent());
        }
    }
    public void printSortLecturerByName(){
        for (Lecturer lecturer: managerOfLecturer.sortByName())
        {
            if(lecturer!=null)
                System.out.println(lecturer.getNameOfLecturer()+" "+lecturer.getCourse().getNameOfCourse());
        }
    }



    public void printCourseSortByNumberOfStudent(){
        for( Course course: managerOfCourse.sortByNumberOfStudents()){
            if(course!=null){
                System.out.println(course.getNameOfCourse()+" "+course.getNumberOfStudents());
            }
        }
    }

    public ManagerOfCourse getManagerOfCourse() {
        return managerOfCourse;
    }

    public ManagerOfLecturer getManagerOfLecturer() {
        return managerOfLecturer;
    }

    public ManagerOfLection getManagerOfLection() {
        return managerOfLection;
    }

    public ManagerOfStudent getManagerOfStudent() {
        return managerOfStudent;
    }

}
