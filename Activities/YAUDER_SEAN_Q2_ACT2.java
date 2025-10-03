/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ihub27
 */
public class YAUDER_SEAN_Q2_ACT2 {
    static Scanner coffee = new Scanner(System.in);
    static boolean running = false;
    static int bal = 0;

    public static void main(String[] args) {
        boolean isDone = true;

        int select = 0;
        do{
            System.out.println("======Coffee Vending Machine======");
            System.out.println("[1] Americano - Php 110.00");
            System.out.println("[2] Latte - Php 120.00");
            System.out.println("[3] Cappuccino - Php 125.00");
            System.out.println("[4] Espresso - Php 115.00");
            System.out.println("[5] Exit");
            System.out.println("==================================");
            select = choose();
            if (select > 5){
                System.out.println("Invalid choice: Please try again.");
            }else{
                switch(select){
                    case 1:
                        inputmoney("Americano",110);
                        order("Americano",110);
                        iforderAgain();
                        break;
                    case 2:
                        inputmoney("Latte",120);
                        order("Latte",120);
                        iforderAgain();
                        break;
                    case 3:
                        inputmoney("Cappuccino",125);
                        order("Cappuccino",125);
                        iforderAgain();
                        break;
                    case 4:
                        inputmoney("Espresso",115);
                        order("Espresso",115);
                        iforderAgain();
                        break;
                    case 5:
                        running=false;
                        break;
                }
            }
                
        }while(running);
    }
    
    public static int choose(){
        int choice = 0;
        while (true){
            System.out.print("Choose your coffee (1-5): ");
            
            if(coffee.hasNextInt()){
              choice = coffee.nextInt();
              break;
            }else{
                coffee.next();
            }
        }
           return choice;     
    }
    public static int inputmoney(String ordertype, double price){
        int money=0;
        while(true){
            System.out.println("You chose "+ordertype+". Price: Php "+price);
            System.out.println("Insert Money: ");
            
            if(coffee.hasNextInt()){
                money = coffee.nextInt();
                bal = bal + money;
                break;
            }else{
                coffee.next();
            }
        }
        return money;
    }
    public static int iforderAgain(){
        int select=0;
        boolean isDone=false;
        do{
        System.out.println("======Coffee Vending Machine======");
        System.out.println("Would you like to order again?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.println("==================================");
        select = coffee.nextInt();
        if(select > 2){
            
        }else{
            switch(select){
                case 1:
                    isDone=true;
                    running=true;
                    break;
                case 2:
                    System.out.println("Thank you!");
                    isDone=true;
                    running=false;
                    break;
            }
        }
        }while(!isDone);
        return select;
    }
    public static void order(String ordertype, double price){
        double rbal = bal - price;
        if(bal==price){
            System.out.println("Exact payment recieved! No change needed.");
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if(bal >price){
            System.out.println("Your change is: Php "+rbal );
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if (bal <price) {
            System.out.println("Your balance is: " +bal);
            System.out.println("Insufficient funds. Transaction failed!");
        }
    }
    
}
//        switch (select) {
//            case 1: 
//                System.out.println("You chose Americano. Price: Php 110.00");
//                System.out.println("Insert Money: ");
//                order++;
//                int money = coffee.nextInt();
//                int change = money - 110;
//                if (money == 110.00) {System.out.println("Exact payment recieved! No change needed.");
//                    System.out.println("Thank you. Enjoy your coffee!"); 
//                while (order < 2) {
//                    System.out.println("======Coffee Vending Machine======");
//                    System.out.println("Would you like to order again?");
//                    System.out.println("[1] Yes");
//                    System.out.println("[2] No");
//                    System.out.println("==================================");
//                    int choice = coffee.nextInt();
//                    
//                    if (choice == 1) {
//                        order = order - 2;
//                    }  else if (choice == 2) {
//                    order = order + 1000;
//                    System.out.println("Thank you. Have a nice day!");
//                    } else if (choice > 2) {
//                        System.out.println("Invalid Selection! Please try again.");
//                    order = order - 3;
//                    }   
//                }
//                if (money > 110){System.out.println("Your change is: Php "+change );
//                    System.out.println("Thank you. Enjoy your coffee!");
//                order++;
//                while (order < 2) {
//                    System.out.println("======Coffee Vending Machine======");
//                    System.out.println("Would you like to order again?");
//                    System.out.println("[1] Yes");
//                    System.out.println("[2] No");
//                    System.out.println("==================================");
//                    int choice = coffee.nextInt();
//                    
//                    if (choice == 1) {
//                        order = order - 2;
//                    }  else if (choice == 2) {
//                    order = order + 1000;
//                    System.out.println("Thank you. Have a nice day!");
//                    } else if (choice > 2) {
//                        System.out.println("Invalid Selection! Please try again.");
//                    order = order - 3;
//                    }
//                }
//                if (money < 110) {System.out.println("Insufficient funds. Transaction failed!");
//                order++;
//                while (order < 2) {
//                    System.out.println("======Coffee Vending Machine======");
//                    System.out.println("Would you like to order again?");
//                    System.out.println("[1] Yes");
//                    System.out.println("[2] No");
//                    System.out.println("==================================");
//                    int choice = coffee.nextInt();
//                    
//                    if (choice == 1) {
//                        order = order - 2;
//                    }  else if (choice == 2) {
//                    order = order + 1000;
//                    System.out.println("Thank you. Have a nice day!");
//                    } else if (choice > 2) {
//                        System.out.println("Invalid Selection! Please try again.");
//                    order = order - 3;
//                    }
//                }
//            break;
////            case 2: System.out.println("You chose Latte. Price: Php 120.00");
//                 System.out.println("Insert Money: ");
//                int money1 = coffee.nextInt();
//                int change1 = money1 - 120;
//                if (money1 == 120.00) {System.out.println("Exact payment recieved! No change needed.");
//                    System.out.println("Thank you. Enjoy your coffee!"); }
//                else if (money1 >= 120){System.out.println("Your change is: Php "+change1 );
//                System.out.println("Thank you. Enjoy your coffee!");}
//                else if (money1 <= 120) {System.out.println("Insufficient funds. Transaction failed!");
//                }
//                break;
//            case 3: System.out.println("You chose Cappuccino. Price: Php 125.00");
//                System.out.println("Insert Money: ");
//                int money2 = coffee.nextInt();
//                int change2 = money2 - 125;
//                if (money2 == 125.00) {System.out.println("Exact payment recieved! No change needed.");
//                    System.out.println("Thank you. Enjoy your coffee!"); }
//                else if (money2 >= 125){System.out.println("Your change is: Php "+change2 );
//                System.out.println("Thank you. Enjoy your coffee!");}
//                else if (money2 <= 125) {System.out.println("Insufficient funds. Transaction failed!");
//                }
//                break;
//            case 4: System.out.println("You chose Espresso. Price: Php 115.00");
//            System.out.println("Insert Money: ");
//                int money3 = coffee.nextInt();
//                int change3 = money3 - 115;
//                if (money3 == 115.00) {System.out.println("Exact payment recieved! No change needed.");
//                    System.out.println("Thank you. Enjoy your coffee!"); }
//                else if (money3 >= 115){System.out.println("Your change is: Php "+change3 );
//                System.out.println("Thank you. Enjoy your coffee!");}
//                else if (money3 <= 115) {System.out.println("Insufficient funds. Transaction failed!");
//                }
//                break;
//            case 5: System.out.println("Goodbye! Come back soon.");
//            break;
//            default: System.out.println("Invalid selection.");
//            order--;
//        }   
//            System.out.println(order);
//        
//   }
//           coffee.close();
//   }
//    }
//}
//    }
//}
//}