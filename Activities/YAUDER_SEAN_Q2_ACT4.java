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
        Scanner math = new Scanner(System.in);
            System.out.println("=======================");
            System.out.println("  Sum of Even Numbers  ");
            System.out.println("=======================");
            System.out.println("");
            System.out.print("Enter a number: ");
            int number = math.nextInt();
            int i = 2;
            int sum = 0;
            while (i<=number) {
                sum = sum + i;
                i+=2;
            } System.out.println("The sum of even numbers from 1"+" to " +number +": "+sum);
//            for (int i = 2;i <= number; i+=2){
//                int sum = 0;
//                sum+=i
//                System.out.println(sum);
//            }
            math.close();
    }
}
//    System.out.println("The sum of even numbers from 1"+" to " +number +": "sum);