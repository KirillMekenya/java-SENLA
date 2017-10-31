package storages;

import beans.Lecturer;

public class StorageOfLectures {
    private Lecturer[] allLecturer = new Lecturer[300];

    public Lecturer[] getAllLecturer() {
        return allLecturer;
    }

    public int getNumberOfLecturers() {
        int numberOfLecturers = 0;
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null)
                numberOfLecturers++;
        }
        return numberOfLecturers;
    }

    public void addLecturer(Lecturer lecturer) {
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] == null) {
                allLecturer[i] = lecturer;
                break;
            }
        }
    }

    public void removeLecturer(String nameOfLecturer) {
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null && allLecturer[i].getNameOfLecturer().equals(nameOfLecturer)) {
                allLecturer[i] = null;
            }
        }

    }
}
