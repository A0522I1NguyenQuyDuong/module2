package BT1.Model;

public class Teacher extends Person{
    private String level;

    public Teacher() {

    }

    public Teacher(int code, String name, String gender, String date, String level) {
        super(code, name, gender, date);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                '}';
    }
}
