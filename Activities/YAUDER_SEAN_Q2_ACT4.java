/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ihub27
 */
public class YAUDER_SEAN_Q2_ACT4 {
    public static void main(String[] args) {
        try (Scanner math = new Scanner(System.in)) {
            System.out.println("=======================");
            System.out.println("  Sum of Even Numbers  ");
            System.out.println("=======================");
            System.out.println("");
            System.out.print("Enter a number: ");
            int number = math.nextInt();
            int sum = 0;
            for (int j = 0; j <= number; j++) {
                if (j % 2 == 0) { // change to 1 to find sum of odd numbers
                    sum += j;
                }
            }
            System.out.println("The sum of even numbers from 1"+" to " +number +": "+sum);
        }
    }
}
