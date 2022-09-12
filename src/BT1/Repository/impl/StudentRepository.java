package BT1.Repository.impl;

import BT1.Model.Student;
import BT1.Repository.IRepositoryStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository implements IRepositoryStudent {
    private ArrayList<Student> studentlist;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Nhập code: \n");
        int newCode = sc.nextInt();
        System.out.println("Nhập Tên: \n");
        String newName = sc.next();
        System.out.println("Nhập giới tính: \n");
        String newGender = sc.next();
        System.out.println("Nhập ngày sinh: \n");
        String newDate = sc.next();
        System.out.println("Nhập tên lớp: \n");
        String newnameClass = sc.next();
        System.out.println("Nhập điểm: \n");
        double newPoint = sc.nextInt();
        Student newStudent = new Student(newCode,newName,newGender,newDate,newnameClass,newPoint);
        studentlist.add(newStudent);

    }

    @Override
    public void removeStudent(int index) {

    }

    @Override
    public void showListStudent() {
        for (Student student : studentlist) {
            System.out.println(student.toString() + "\n");
        }
    }
}
