package M.R.Hajari;

import java.util.Scanner;

public class Credit {
    public double tuitionBalance;
    Scanner input = new Scanner(System.in);

    public void setTuitionBalance(double tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    // View balance
    public void viewBalance(){
        System.out.println("\n``````````````````````````````````````````");
        System.out.format("Your Balance is: %.2f€\n", tuitionBalance);
    }


    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: ");
        double payment = pymentInputChck();
        if (payment <= tuitionBalance){
            tuitionBalance = tuitionBalance - payment;
            System.out.format("\nThank you for your payment of %.2f€\n", payment);
        } else {
            System.out.println("Your credit is not enough.\nYou have to charge your balance.");
        }
        viewBalance();
    }

    private double pymentInputChck(){
        double payment = 0;
        String strInpt;
        boolean pymentInputChckFlag = true;

        do{
            strInpt = input.nextLine();
            if (isDouble(strInpt) == true ){
                pymentInputChckFlag = false;
                payment = Double.parseDouble(strInpt);
            } else {
                System.out.println("Oops! That was no valid value. Try again...");
            }
        } while (pymentInputChckFlag);

        return payment;
    }


    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
