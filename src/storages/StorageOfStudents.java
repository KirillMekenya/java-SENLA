package storages;

import beans.Student;

public class StorageOfStudents {
    private Student[] allStudents;


    public StorageOfStudents (){
        allStudents = new Student[300];
    }

    public Student[] getAllStudents() {
        return allStudents;
    }

    public int getNumberOfStudents(){
        int numberOfStudents = 0;
        for (int i = 0; i<allStudents.length; i++)
        {
            if(allStudents[i]!=null)
                numberOfStudents++;
        }
        return numberOfStudents;
    }



    public void addStudent(Student student) {
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] == null){
                allStudents[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String nameOfStudent) {
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] != null && allStudents[i].getNameOfStudent().equals(nameOfStudent)) {
                allStudents[i] = null;

            }
        }

    }
}
