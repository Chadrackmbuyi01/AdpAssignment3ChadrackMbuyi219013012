/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseloops;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Ilovejava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int number;
        
        System.out.println("Please Enter any number between 1-10");
        number = input.nextInt();
        
        switch (number)
        {
            case 1:
                System.out.println("The input is valid");
                break;
            case 2:
                System.out.println("The input is valid");
                break;
            case 3:
                System.out.println("The input is valid");
                break;
            case 4:
                System.out.println("The input is valid");
                break;
            case 5:
                System.out.println("The input is valid");
                break;
            case 6:
                System.out.println("The input is valid");
                break;
            case 7:
                System.out.println("The input is valid");
                break;
            case 8:
                System.out.println("The input is valid");
                break;
            case 9:
                System.out.println("The input is valid");
                break;
            case 10:
                System.out.println("The input is valid");
                break;
            default:
                System.out.println("The number is not within the range. Thanks Bye");
      
        }
        
        while (number<=10){
            System.out.println("I love Java" + number);
            number++;
        }
        
        
        
        
    }
    
}
