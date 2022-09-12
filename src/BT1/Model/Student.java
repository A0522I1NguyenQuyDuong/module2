package BT1.Model;

public class Student extends Person {
   private String nameClass;
   private double point;

    public Student() {

    }

    public Student(int code, String name, String gender, String date, String nameClass, double point) {
        super(code, name, gender, date);
        this.nameClass = nameClass;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameClass='" + nameClass + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
