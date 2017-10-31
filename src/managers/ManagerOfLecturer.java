package managers;

import beans.Lecturer;
import storages.StorageOfLectures;

import java.util.Arrays;

public class ManagerOfLecturer {

    private StorageOfLectures storageOfLectures;

    public ManagerOfLecturer() {
        storageOfLectures = new StorageOfLectures();
    }

    public Lecturer[] getAllLecturer() {
        return storageOfLectures.getAllLecturer();
    }

    public int getNumberOfLecturers() {
        return storageOfLectures.getNumberOfLecturers();
    }

    public void addLecturer(Lecturer lecturer) {
        storageOfLectures.addLecturer(lecturer);
    }

    public void removeLecturer(String nameOfLecturer) {
        storageOfLectures.removeLecturer(nameOfLecturer);
    }

    public Lecturer[] sortByName() {
        Lecturer[] temp = getAllLecturer();
        Arrays.sort(temp, Lecturer.SortByName);
        return temp;
    }
}

