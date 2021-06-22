package M.R.Hajari;

import java.util.LinkedList;
import java.util.List;

public class Courses extends Credit {
    protected int gradeYear;
    protected List<String> coursesList=new LinkedList<String>();

    public void coursInfoPrint(){
        for (String cours:coursesList) {
            System.out.print(cours + " - ");
        }
    }

    public void  setCourses(){
        String course;
        int courseCounter = 0;
        System.out.print("Courses:Sciences - Art - Music - Design - Economic Sciences - Engineering Sciences - Humanities");
        System.out.print("\nEnter course to enroll (Q to quit): ");
        do{
            course = input.nextLine();
            if(!course.equals("Q")){
                coursesList.add(course);
                courseCounter++;
                System.out.print("the next please: ");
            } else{
                break;
            }
        }while (true);
    }


    public int getGradeYear() { return gradeYear; }

    public int setGradeYear() {
        System.out.print("1 for Frechmen\n2 for Sophmore\n" +
                "3 for Junior\n4 for Sinuor\nEnter student class level: ");
        String gradeYearChoice = "";
        boolean flaggradeYearChoice = true;

        while (flaggradeYearChoice == true) {
            gradeYearChoice = input.nextLine();

            if(gradeYearChoice.length() == 1) {
                if ( gradeYearChoice.equals("1") || gradeYearChoice.equals("2") ||
                        gradeYearChoice.equals("3") || gradeYearChoice.equals("4")  == true) {
                    flaggradeYearChoice = false;
                } else {
                    System.out.println("Oops! That was no valid value. Try again...");
                }
            }else{
                System.out.println("Oops! That was no valid value. Try again...");
            }
        }
        this.gradeYear = Integer.valueOf(gradeYearChoice);

        return Integer.valueOf(gradeYearChoice);
    }
}
