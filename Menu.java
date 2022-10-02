/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class Menu<T> {
    public String title;
    public ArrayList<T> mchon;
    
    public Menu(){
        
    }
    
    public Menu(String td, String [] mc){
        title = td;
        mchon = new ArrayList<>();
        for(String s: mc) mchon.add((T) s);
    }
    
    public void display(){
        System.out.println(title);
        System.out.println("-----------");
        for (int i = 0; i < mchon.size(); i++) {
            System.out.println((i+1) + "." + mchon.get(i));         
        }
        System.out.println("-----------");
    }
    
    public int getSelected(){
        display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selection: ");
        return sc.nextInt();
    }
    
    public abstract void execute(int n);
    
    public void run(){
        while (true) {            
            int n = getSelected();
            execute(n);
//            if(n > mchon.size()) break;
        }
    }
}
