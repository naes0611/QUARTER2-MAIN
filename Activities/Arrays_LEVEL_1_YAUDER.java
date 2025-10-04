/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class Arrays_LEVEL_1_YAUDER {
    static Scanner array = new Scanner(System.in);
    public static void main(String[] args) {
        String[] things;
        System.out.print("Enter Array size: ");
        int size = array.nextInt();
        things = new String[size];
        System.out.print("Input "+size+" Things: ");
        for(int i=0; i<size;i++){
        things[i]= array.next();
        }
        
        System.out.println(things.length +" Things: ");
        for (int i=0; i<size;i++)
        {
            System.out.println( i+1 +" "+things[i]);
        }   
    }
}

