package LopChiGhi;

public class Student {
    private String name = "John";
    private String classes = "C02";
 public Student(){

 }
 public Student(String name, String classes){
     this.name = name;
     this.classes = classes;
 }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
       Student st = new Student();
       String name = "Nguyễn Quý Dương";
       st.setName(name);
       String classes = "A0522I1";
       st.setClasses(classes);
    }
}
