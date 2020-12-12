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
        float firstNumber,secondNumber;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your First number:-");
        firstNumber=scanner.nextFloat();
        System.out.println("Enter your second number:-");
        secondNumber=scanner.nextFloat();
        System.out.println("Select operation:-");
      System.out.println(" for Addition press-a:-"); 
      System.out.println("for Subtraction press-s:");
      System.out.println("for Multiplication press-m:");
      System.out.println("for Division press -/:");
      System.out.println("for Modulus press-%:");
                              
      char cal = scanner.next().charAt(0);
        switch(cal){
        case 'a':
            System.out.println("Sum of the given two numbers: "+(firstNumber + secondNumber));
            break;
            case 's':
            System.out.println("Subtraction of the given two numbers: "+(firstNumber - secondNumber));
            break;
            case 'm':
            System.out.println("mutliplicaton of the given two numbers: "+(firstNumber * secondNumber));
            break;
            case '/':
            System.out.println("division of the given two numbers: "+(firstNumber / secondNumber));
            break;
            case '%':
            System.out.println("modulus of the given two numbers: "+(firstNumber % secondNumber));
            break;
            default :
                System.out.println("please select suitable operator");
        }
        
      
    }
    
}
