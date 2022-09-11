package Repository;

import Model.Lecturer;
import Model.Student;
import Repository.impl.LecturerRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class IRepositoryLecturer implements LecturerRepository {
    private ArrayList<Lecturer> lecturerList;
    Scanner sc = new Scanner(System.in);


    @Override
    public void addLecturer() {
        System.out.println("Enter code: \n");
        int newCode = sc.nextInt();
        System.out.println("Enter name: \n");
        String newName = sc.nextLine();
        System.out.println("Enter gender: \n");
        String newGender = sc.nextLine();
        System.out.println("Enter date: \n");
        String newDate = sc.nextLine();
        System.out.println("Enter level");
        String newLevel = sc.nextLine();

    }

    @Override
    public void removeLecturer(int index) {

    }

    @Override
    public void showListLecturer() {
       for (Lecturer lecturer : lecturerList){
           System.out.println(lecturer.toString() + "\n");
       }
    }
}
