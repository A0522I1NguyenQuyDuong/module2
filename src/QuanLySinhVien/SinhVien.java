package QuanLySinhVien;

import java.util.Scanner;
import java.io.*;

public class SinhVien {
    private String Code;
    private String Name;
    private String Age;
    private String Date;
    private String Point;


    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
       this.Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
      this.Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getPoint() {
        return Point;
    }

    public void setPoint(String point) {
        this.Point = point;
    }
    public SinhVien(){

    }
    public SinhVien(String Code, String Name, String Age, String Date, String Point){
        this.Code = Code;
        this.Name = Name;
        this.Age = Age;
        this.Date = Date;
        this.Point = Point;
    }

}
