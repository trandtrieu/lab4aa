
package View;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validation {
    public static Scanner sc = new Scanner(System.in);
    private static final String PHONE_VALID = "^\\d{10}\\d*$";
    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
    private static final String NAME_VALID = "^[a-zA-Z\\s]+";

    public int checkInputIntLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + "; " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputPhone(String msg) {
        while (true) {
            String result = checkInputString(msg);

            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.err.println("Phone is number with minimum 10 characters");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputString(String msg) {

        while (true) {
            System.out.println(msg);
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }    

    public String checkInputEmail(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public String checkInputName(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.matches(NAME_VALID)) {
                return result;
            } else {
                System.err.println("Please enter just enter letter and no number!!! ");
                System.err.println("Enter again: ");
            }
        }
    }
    
    public String checkInputGraduationRank(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public int checkInputExprience(int birthDate) {
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true) {
            int yearExperience = checkInputIntLimit(1, 100);
            if (yearExperience > age) {
                System.err.println("Experience must be smaller than age");
            } else {
                return yearExperience;
            }
        }

    }    
 
    public boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = checkInputStringg();
            //check user input y/Y or n/N
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static String checkInputStringg() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }  
}
