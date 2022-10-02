/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Candidate {
    public String candidateID;
    public String firstname;
    public String lastName;
    public int birthday;
    public String address;
    public String phone;
    public String mail;
    public int candidateType;

    public Candidate() {
    }

    public Candidate(String candidateID, String firstname, String lastName, int birthday, String address, String phone, String mail, int candidateType) {
        this.candidateID = candidateID;
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.candidateType = candidateType;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return  "ID= " + candidateID + "| firstname= " + firstname + "   | lastName= " + lastName + "|      birthday= " + birthday + "|      address= " + address + "|     phone= " + phone + "|    mail= " + mail + "|    candidateType= " + candidateType;
    }
   
    
    public void display(){
        System.out.println(this);
    }
    
}
