/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *  DYNAMIC LEVEL ONE ARRAYLIST
 */
public class ArraysList_Level_One_YAUDER {
    
    static Scanner userInput = new Scanner(System.in);
    static boolean running = true;
    static boolean isDone = false;
    static List<String> shoppingCart = new ArrayList<>();
    public static void main(String[] args) {
        do{
            shoppingMenu();
            int select = selectOption();
            switch(select){
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
                case 3:
                    viewCart();
                    break;
            }
        }while(running);
        userInput.close();
    }
    
    static void shoppingMenu(){
        System.out.println("SHOPPING CART\n"
        + "1 ADD ITEMS\n"
                + "2 REMOVE ITEMS\n"
                + "3 VIEW CART\n"
                + "Exit");
    }
    
    static void addItems(){
        
        String item;
        int itemAmount;
        System.out.print("Enter the name of the item that you want to add: ");
        item = userInput.nextLine();
        System.out.println("Amount: ");
        itemAmount = userInput.nextInt();
        System.out.println(itemAmount +"x "+ item+" has now been added to your Cart");
        for (int i = 0; i > itemAmount; i++){
            shoppingCart.add(item);
        }
            System.out.println("Still want to continue?\n"
                    + "Yes\n"
                    + "No");
            String ifContinue = userInput.nextLine();
            
        if (ifContinue.equalsIgnoreCase("no")){
            break;
        }
        
        
    }
    
    static void removeItems(){
        
    }
    
    static void viewCart(){
        System.out.println(shoppingCart);
    }

    static int selectOption(){
        String input;
        while(true){
            System.out.print("Select your choice: ");
            input = userInput.nextLine().trim();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Thank you for using Shopping Cart!");
                running = false;
                isDone = true;
                return -99;
            }else
            
            try{
                int number = Integer.parseInt(input);
                return number;
            }catch (NumberFormatException e){
                System.out.println("Invalid input! Please try again.");
            }
        }
    }   
    
}
