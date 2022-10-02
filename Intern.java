/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Intern extends Candidate {
    public String majors;
    public String semester;
    public String university_name;

    public Intern() {
    }

    public Intern( String candidateID, String firstname, String lastName, int birthday, String address, String phone, String mail, int candidateType, String majors, String semester, String university_name) {
        super(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }



    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return super.toString()  + "| majors= " + majors + "| semester= " + semester + "| university_name= " + university_name;
    }
    public void display(){
        System.out.println(this);
    }
    
    
}
