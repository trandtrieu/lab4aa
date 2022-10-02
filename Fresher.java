/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Fresher extends Candidate {
    public String graduation_date;
    public String graduation_rank;
    public String education;

    public Fresher( String candidateID, String firstname, String lastName, int birthday, String address, String phone, String mail, int candidateType, String graduation_date, String graduation_rank, String education) {
        super(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }


    public Fresher() {
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }



    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }    

    @Override
    public String toString() {
        return super.toString() + "| Fresher: " + "| graduation_date= " + graduation_date + "| graduation_rank= " + graduation_rank;
    }
    public void display(){
        System.out.println(this);
    }    
}
