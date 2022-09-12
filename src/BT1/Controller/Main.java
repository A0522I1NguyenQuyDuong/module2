package BT1.Controller;

import BT1.Service.IServiceStudent;
import BT1.Service.IServiceTeacher;
import BT1.Service.impl.StudentService;
import BT1.Service.impl.TeacherService;

import java.util.Scanner;

public class Main {
    private static IServiceStudent studentService = new StudentService();
    private static IServiceTeacher teacherService = new TeacherService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int choose;
          do {
              System.out.println(
                              "CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN \n"+
                              "1. Thêm mới sinh viên hoặc giảng viên \n"+
                              "2. Xóa sinh viên hoặc giảng viên \n"+
                                      "3. Xem danh sách sinh viên hoặc giảng viên \n"+
                                      "4. THOÁT CHƯƠNG TRÌNH."
              );
              System.out.println("Chọn chức năng.");
              choose = sc.nextInt();
              switch (choose){
                  case 1:
                      System.out.println("1. Sinh viên. \n"+
                              "2. Giảng viên");
                      choose = sc.nextInt();
                      if (choose == 1){
                          studentService.addStudent();
                      } else if (choose == 2) {
                          teacherService.addNewTeacher();
                      } else {
                          System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                      }
                  case 2:
                      System.out.println("1. Sinh viên. \n"+
                              "2. Giảng viên");
                      choose = sc.nextInt();
                      if (choose == 1){
                          System.out.println("Nhập code sinh viên:");
                      } else if (choose == 2) {
                          teacherService.addNewTeacher();
                      }else {
                          System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                      }
                  case 3:
                      System.out.println("1. Sinh viên. \n"+
                              "2. Giảng viên");
                      choose = sc.nextInt();
                      if (choose == 1){
                          studentService.showListStudent();
                      } else if (choose == 2) {
                          teacherService.showListTeacher();
                      }else {
                          System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                      }
              }
          }while (choose != 4);
    }
}
