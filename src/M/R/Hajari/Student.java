package M.R.Hajari;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Courses {

    private String firstName;
    private String lastName;
    private String StudentID;
    private static int id = 10000;

    Scanner input = new Scanner(System.in);

    // Constractor: prompet user to enter student's name and year
    public Student (String firstName, String lastName ){
        setFirstName(this.firstName);
        setFirstName(this.lastName);
    }

    public Student (){
        super();
        System.out.print("Enter your firstname: ");
        this.firstName = nameInputAndCheck();

        System.out.print("Enter your firstname: ");
        this.lastName = nameInputAndCheck();

        this.StudentID = setStudentID();
    }

    // Getter methods
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Generate an ID
    public String setStudentID() {
        id++;
        return setGradeYear() +""+id;
    }


    // Show status
    public void showInfo(){
        System.out.println("``````````````````````````````````");
        System.out.println("firstname: " + firstName +
                "\nlastname: " + lastName +
                "\ngrade year: " + getGradeYear() +
                "\nStudent ID: " + StudentID);
        System.out.print("Selected Cors: ");
        coursInfoPrint();
    }


    // Name input with check
    public String nameInputAndCheck(){
        boolean checkflag = true;
        String str = "";
        while (checkflag){
            str = input.nextLine();
            if (str.length() > 2){
                checkflag = false;
            } else{
                System.out.println("Oops! That was no valid value. Try again...");
                checkflag = true;
            }
        }
        return str;
    }
}
