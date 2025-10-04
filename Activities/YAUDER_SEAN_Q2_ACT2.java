
import java.util.*;

public class YAUDER_SEAN_Q2_ACT2 {
    static Scanner coffee = new Scanner(System.in);
    static boolean running = true;
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
                delays(1000);
                clearTerminal();

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
                        coffee.close();

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
              clearTerminal();
              break;
            }else{
                coffee.next();
            }
        }
           return choice;     
    }
    public static int inputmoney(String ordertype, double price){ // order process
        int money=0;
        while(true){
            System.out.println("You chose "+ordertype+". Price: Php "+price);
            System.out.print("Insert Money: ");
            
            if(coffee.hasNextInt()){
                money = coffee.nextInt();
                bal = bal + money;
                delays(750);
                clearTerminal();
                break;
            }else{
                coffee.next();
            }
        }
        return money;
    }
    
    public static void order(String ordertype, double price){
        double rbal = bal - price;
        if(bal==price){
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Exact payment recieved! No change needed.");
            delays(750);
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if(bal >price){
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Your change is: Php "+rbal );
            delays(750);
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if (bal <price) {
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Insufficient funds. Transaction failed!");
            delays(750);
            System.out.println("Your balance is: " +bal);

        }
    }
    public static int iforderAgain(){
        int select=0;
        boolean isDone=false;
        do{
            bal = 0;
            delays(1000);
            clearTerminal(); 
            
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
                        clearTerminal();
                        break;
                    case 2:
                        delays(500);
                        System.out.println("Thank you!");
                        isDone=true;
                        running=false;
                        coffee.close();
                        break;
                }
            }
        }while(!isDone);
            return select;
    }
    public static int delays(int delayMS){ // delay method
        try{
            Thread.sleep(delayMS);
        }catch(InterruptedException e){
            
        }
        return delayMS;
    }
    public static void clearTerminal(){ // clears termina
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
import java.util.*;

public class YAUDER_SEAN_Q2_ACT2 {
    static Scanner coffee = new Scanner(System.in);
    static boolean running = true;
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
                delays(1000);
                clearTerminal();

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
              clearTerminal();
              break;
            }else{
                coffee.next();
            }
        }
           return choice;     
    }
    public static int inputmoney(String ordertype, double price){ // order process
        int money=0;
        while(true){
            System.out.println("You chose "+ordertype+". Price: Php "+price);
            System.out.print("Insert Money: ");
            
            if(coffee.hasNextInt()){
                money = coffee.nextInt();
                bal = bal + money;
                delays(750);
                clearTerminal();
                break;
            }else{
                coffee.next();
            }
        }
        return money;
    }
    
    public static void order(String ordertype, double price){
        double rbal = bal - price;
        if(bal==price){
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Exact payment recieved! No change needed.");
            delays(750);
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if(bal >price){
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Your change is: Php "+rbal );
            delays(750);
            System.out.println("Thank you for ordering "+ordertype+". Enjoy your coffee!");
        }else if (bal <price) {
            System.out.println("Processing..");
            delays(1000);
            System.out.println("Insufficient funds. Transaction failed!");
            delays(750);
            System.out.println("Your balance is: " +bal);

        }
    }
    public static int iforderAgain(){
        int select=0;
        boolean isDone=false;
        do{
            bal = 0;
            delays(1000);
            clearTerminal(); 
            
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
                        clearTerminal();
                        break;
                    case 2:
                        delays(500);
                        System.out.println("Thank you!");
                        isDone=true;
                        running=false;
                        break;
                }
            }
        }while(!isDone);
            return select;
    }
    public static int delays(int delayMS){ // delay method
        try{
            Thread.sleep(delayMS);
        }catch(InterruptedException e){
            
        }
        return delayMS;
    }
    public static void clearTerminal(){ // clears termina
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    coffee.close();
}


