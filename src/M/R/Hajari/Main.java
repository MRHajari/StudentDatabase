package M.R.Hajari;

public class Main {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setCourses();
        stu1.setTuitionBalance(1500);
        stu1.payTuition();
        stu1.showInfo();
    }
}
