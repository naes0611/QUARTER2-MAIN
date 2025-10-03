/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class YAUDER_SEAN_Q2_ACT1 {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Enter first number: ");
        int num1 = calculator.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = calculator.nextInt();
        
        System.out.println("Choose an operation");
        System.out.println("[1] +");
        System.out.println("[2] -");
        System.out.println("[3] *");
        System.out.println("[4] /");
        int operation = calculator.nextInt();
        System.out.println("=================================");
        
        //=========================
        
        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        
      switch (operation) {
      case 1 -> System.out.println("Result: "+num1 +" + " +num2+" = " +add );
      case 2 -> System.out.println("Result: "+num1 +" - " +num2+" = " +subtract );
      case 3 -> System.out.println("Result: "+num1 +" * " +num2+" = " +multiply );
      case 4 -> System.out.println("Result: "+num1 +" / " +num2+" = " +divide );
      
    
    }
      calculator.close();
    }
    
}
