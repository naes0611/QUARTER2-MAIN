/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class Arrays_LEVEL_1_YAUDER {
    static Scanner array = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Array size: ");
        int size = array.nextInt();
        System.out.print("Enter Array name: ");
        String arrayType = array.next();
        
        String[] Array = new String[size];
        System.out.println("Input "+size+" types of "+arrayType+": ");
        for(int i=0; i<size;i++){
        Array[i] = array.next();
        }
        //Display
        System.out.println("\n"+ size +" "+arrayType+":");
        for (int i=0; i<Array.length;i++)
        {
            System.out.println(Array[i]);
        }   
        array.close();
    } 
}




