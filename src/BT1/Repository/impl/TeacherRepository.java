package BT1.Repository.impl;

import BT1.Model.Teacher;
import BT1.Repository.IRepositoryTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherRepository implements IRepositoryTeacher {
     private ArrayList<Teacher> teacherlist;
     Scanner sc = new Scanner(System.in);
    @Override
    public void addNewTeacher() {
        System.out.println("Nhập code: \n");
        int newCode = sc.nextInt();
        System.out.println("Nhập Tên: \n");
        String newName = sc.next();
        System.out.println("Nhập giới tính: \n");
        String newGender = sc.next();
        System.out.println("Nhập ngày sinh: \n");
        String newDate = sc.next();
        System.out.println("Nhập level: \n");
        String newLevel = sc.next();
        Teacher newTeacher = new Teacher(newCode,newName,newGender,newDate,newLevel);
    }

    @Override
    public void removeTeacher(int index) {

    }

    @Override
    public void showListTeacher() {

    }
}
