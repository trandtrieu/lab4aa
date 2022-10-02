/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Experience extends Candidate {
    public int expInyear;
    public String proSkill;

    public Experience() {
    }

    public Experience(String candidateID,String firstname, String lastName, int birthday, String address, String phone, String mail, int candidateType,int expInyear, String proSkill) {
        super(candidateID, firstname, lastName, birthday, address, phone, mail, candidateType);
        this.expInyear = expInyear;
        this.proSkill = proSkill;
    }



    public int getExpInyear() {
        return expInyear;
    }

    public void setExpInyear(int expInyear) {
        this.expInyear = expInyear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "Experience: " + "| expInyear= " + expInyear + "| proSkill= " + proSkill;
    }
    
    public void display(){
        System.out.println(this);
    }    
    
    
}
