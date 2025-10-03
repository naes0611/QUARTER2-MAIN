/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ihub27
 */
public class YAUDER_SEAN_Q2_ACT3 { public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        
            System.out.println("========================");
            System.out.println("  Multiplication Table  ");
            System.out.println("========================");
            System.out.print("Enter a number: ");
            int number = math.nextInt();
            for (int i = 1;i <= 10;i++) {
                int x = number * i;
                System.out.println(number +" * " +i +" = "+x);
            }
            math.close();
    }
}

