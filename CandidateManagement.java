package Controller;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import View.Validation;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CandidateManagement extends Candidate {

    Validation validate = new Validation();

    private Scanner sc = new Scanner(System.in);
    public List<Candidate> candidateList;

    public CandidateManagement() {
        candidateList = new ArrayList();
    }

    public void addExperience() {

        candidateID = validate.checkInputString("- Enter ID: ");
        firstname = validate.checkInputName("- Enter first name: ");
        lastName = validate.checkInputName("- Enter last name:");
        System.out.println("- Enter year of birth:");
        birthday = validate.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
        address = validate.checkInputString("- Enter address: ");
        phone = validate.checkInputPhone("- Enter number phone:");
        mail = validate.checkInputEmail("- Enter mail: ");
        System.out.println("- Enter expInyear: ");
        int expInyear = validate.checkInputIntLimit(0, 100);
        String proSkill = validate.checkInputString("- Enter pro skill: ");

        candidateList.add(new Experience(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType, expInyear, proSkill));
        System.out.println("Add success!!!");
        System.out.println("- Do you want to continue (Y/N): ");
        System.out.println("1. Yes\n2. No");

        int choice = validate.checkInputIntLimit(1, 2);
        System.out.println(choice);
        switch (choice) {
            case 1:
                addExperience();
                break;
            case 2:
                printList("");
                break;
        }
    }

    public void addFresher() {
        candidateID = validate.checkInputString("- Enter ID: ");
        firstname = validate.checkInputName("- Enter first name: ");
        lastName = validate.checkInputName("- Enter last name:");
        System.out.println("- Enter year of birth: ");
        birthday = validate.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
        address = validate.checkInputString("- Enter address: ");
        phone = validate.checkInputPhone("- Enter number phone:");
        mail = validate.checkInputEmail("- Enter mail: ");
        String graduation_date = validate.checkInputString("- Enter graduation date: ");
        String graduation_rank = validate.checkInputGraduationRank("- Enter rank: ");
        String education = validate.checkInputString("- Enter education: ");

        candidateList.add(new Fresher(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType, graduation_date, graduation_rank, education));
        System.out.println("Add success!!!");
        System.out.println("Do you want to continue (Y/N)?");
        System.out.println("1. Yes\n2. No");
        int choice = validate.checkInputIntLimit(1, 2);
        System.out.println(choice);
        switch (choice) {
            case 1:
                addExperience();
                break;
            case 2:
                printList("");
                break;
        }
    }

    public void addIntern() {
        candidateID = validate.checkInputString("- Enter ID: ");
        firstname = validate.checkInputName("- Enter first name: ");
        lastName = validate.checkInputName("- Enter last name:");
        System.out.println("- Enter year of birth: ");
        birthday = validate.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
        address = validate.checkInputString("- Enter address: ");
        phone = validate.checkInputPhone("- Enter number phone:");
        mail = validate.checkInputEmail("- Enter mail: ");
        String majors = validate.checkInputString("- Enter major: ");
        String semester = validate.checkInputString("- Enter semester: ");
        String university_name = validate.checkInputString("- Enter university name: ");

        candidateList.add(new Intern(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType, majors, semester, university_name));
        System.out.println("Add success!!!");
        System.out.println("Do you want to continue (Y/N)?");
        System.out.println("1. Yes \n 2. No");
        int choice = validate.checkInputIntLimit(1, 2);
        System.out.println(choice);
        switch (choice) {
            case 1:
                addExperience();
                break;
            case 2:
                printList("");
                break;
        }

    }

//    public void searchCandidate() {
//        if (candidateList.isEmpty()) {
//            System.out.println("Danh sach sinh vien trong. Ban can them sinh vien!!!");
//        } else {
//            System.out.println("-Search candidate by first name or last name?");
//            System.out.println("1. First name.\n2. Last name ");
//
//            int choice = validate.checkInputIntLimit(1, 2);
//            switch (choice) {
//                case 1 -> {
//                    String first = validate.checkInputString("- Enter first name of candidate you wanna search: ");
//                    for (Candidate ca : candidateList) {
//                        if (ca.getFirstname().contains(first)) {
//                            ca.display();
//                        }
//                    }
//                }
//                case 2 -> {
//                    String last = validate.checkInputString("- Enter last name of candidate you wanna search: ");
//                    for (Candidate ca : candidateList) {
//                        if (ca.getLastName().contains(last)) {
//                            ca.display();
//                        }
//                    }
//                }
//            }
//        }
//    }

    public void searchhCandidate() {
        printListNameCandidate();
        System.out.print("- Enter andidate name (First name or Last name): ");
        String nameSearch = validate.checkInputString(mail);
        System.out.print("- Enter type of candidate: ");
        int typeCandidate = validate.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateType() == typeCandidate
                    && candidate.getFirstname().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    public void printList(String msg) {
        if (candidateList.isEmpty()) {
            System.err.println("List of student is empty!!! You need choose section 1 or 2 to add student and try again!!");

        } else {
            System.out.println(msg);
            for (Candidate ca : candidateList) {
                System.out.println(ca.toString());
            }
        }
    }

    public void addCandidateDefault() {

        candidateList.add(new Experience("de160252", "trieu", "tran", 2002, "quang nam", "0123456789", "trandtrieu@gmail.com", 0, 1, "hi"));
        candidateList.add(new Experience("de160251", "leo", "messi", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 0, 1, "hi"));
        candidateList.add(new Experience("de160253", "eden", "hazard", 1899, "quang nam", "0123456789", "trandtrieu@gmail.com", 0, 1, "hi"));
        candidateList.add(new Fresher("de160254", "cris", "ronaldo", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 1, "12", "hi", "good"));
        candidateList.add(new Fresher("de160542", "son", "heungmin", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 1, "17", "hi", "good"));
        candidateList.add(new Experience("de150252", "kylien", "mbappe", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 0, 1, "hi"));
        candidateList.add(new Intern("de160266", "ering", "halland", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 2, "22", "hi", "FPT"));
        candidateList.add(new Intern("de160299", "neymar", "jr", 1999, "quang nam", "0123456789", "trandtrieu@gmail.com", 2, "18", "hi", "Greenwich"));
        System.out.println("---Add successful!!!---");
    }

    public void printListNameCandidate() {
        System.err.println("========Experience Candidate=======");
        for (Candidate candidate : candidateList) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("=========Fresher Candidate=========");
        for (Candidate candidate : candidateList) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("========Internship Candidate========");
        for (Candidate candidate : candidateList) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastName());
            }
        }
    }
}
