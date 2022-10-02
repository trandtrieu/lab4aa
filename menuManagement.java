/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CandidateManagement;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class menuManagement extends Menu<String>{
    public static String[] menu = {
        "Add candidate default",
        "Experience",
        "Fresher",
        "Internship",
        "Searching",
        "Print list",
        "Exit"
    };
    
    private final CandidateManagement sm;
    public menuManagement() throws IOException{
        super("---CANDIDATE SYSTEM---", menu);
        this.sm = new CandidateManagement();
    }
    

    @Override
    public void execute(int n){
            switch (n) {
                case 1:
                    sm.addCandidateDefault();
                    break;
                case 2:     
                    sm.addExperience();
                    break;
                case 3:
                    sm.addFresher();
                    break;
                case 4:
                    sm.addIntern();
                    break;
                case 5:
//                    sm.printListNameCandidate();
                    sm.searchhCandidate();
//                sm.printList("");
                    break;
                case 6:
                    sm.printList(title);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Enter again");
                    break;
            }
    }
}