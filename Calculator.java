/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


import java.util.Scanner;

/**
 *
 * @author CC
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b;
        Scanner i =new Scanner(System.in);
        System.out.println("Enter First number:-");
        a=i.nextFloat();
        System.out.println("Enter second number:-");
        b=i.nextFloat();
        System.out.println("Select operation:-");
      System.out.println(" for Addition press a: for Subtraction press-s: for Multiplication press-m: for Division press -/: for Modulus press-%: ");
      char cal = i.next().charAt(0);
        switch(cal){
        case 'a':
            System.out.println("Sum of the given two numbers: "+(a+b));
            break;
            case 's':
            System.out.println("Sum of the given two numbers: "+(a-b));
            break;
            case 'm':
            System.out.println("Sum of the given two numbers: "+(a*b));
            break;
            case '/':
            System.out.println("Sum of the given two numbers: "+(a/b));
            break;
            case '%':
            System.out.println("Sum of the given two numbers: "+(a%b));
            break;
            default :
                System.out.println("error");
        }
        
      
    }
    
}
