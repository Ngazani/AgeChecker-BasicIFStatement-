/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkage;

/**
 *
 * @author ngazani
 */
public class CheckAge {

    static void checkAge(int age){
    
        if(age>18){ System.out.println("Access Granted- you are old enough");}
        
        else{System.out.println("Access Denied-You are not old enough");}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkAge(40); 
        
    }
    
    
        
        
        
        
    }
    

