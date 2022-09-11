package Repository;

import Model.Student;
import Repository.impl.StudentRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class IRepositoryStudent implements StudentRepository {
    private ArrayList<Student> studentlist;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Enter code: \n");
        int newCode = sc.nextInt();
        System.out.println("Enter name: \n");
        String newName = sc.nextLine();
        System.out.println("Enter gender: \n");
        String newGender = sc.nextLine();
        System.out.println("Enter date: \n");
        String newDate = sc.nextLine();
        System.out.println("Enter newclass: \n");
        String newnameClass = sc.nextLine();
        System.out.println("Enter point: \n");
        double newPoint = sc.nextInt();

    }

    @Override
    public void removeStudent(int index) {
   index = sc.nextInt() - 1;
   studentlist.remove(index);
    }

    @Override
    public void showListStudent() {
    for (Student student : studentlist);
        System.out.println(studentlist.toString() + "\n");
    }
}
