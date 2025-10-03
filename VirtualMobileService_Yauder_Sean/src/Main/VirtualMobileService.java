package Main;

import java.util.Scanner;
import  VMSOptions.*;

public class VirtualMobileService {

    public static Scanner ussd = new Scanner(System.in);
    public static double bal = 100;
    public static boolean running = true;
    //main
    public static void main(String[] args) {

        //initialization
        String initialSelect = initialdisplay();
        int accSelect = 0;

        if(initialSelect.equalsIgnoreCase("*143#"))
        {
            do{
                Helper.clearTerminal();
                accSelect = accSelection();

                switch(accSelect){
                    case 1:
                        MyAccount.MyAccountProc();
                        break;
                    case 2:
                        GoPlus.GoPlusProc();
                        break;
                    case 3:
                        SuperGo99.SuperGo99Proc();
                        break;
                    case 4:
                        GoExtra.GoExtraProc();
                        break;
                    case 5:
                        Unli5G.Unli5GProc();
                        break;
                    case 6:
                        Go.GoProc();
                        break;
                    case 7:
                        GoBooster.GoBoosterProc();
                        break;
                    case 8:
                        SurfAll.SurfAllProc();
                        break;
                    case 9:
                        AllNet.AllNetProc();
                        break;
                    case 10:
                        GlobeOne.GlobeOneProc();
                        break;
                    case 11:
                        Rewards.RewardsProc();
                        break;
                    case 12:
                        Loans.LoansProc();// need 2 fix
                        break;
                    case 13:
                        running = false;
                        System.out.println("Thank you for using VMS! ");
                        break;
                    default:
                }
            } while(running);
        }else if(initialSelect.equalsIgnoreCase("sean")){
            System.out.println("SEAN YAUDER POGI :)");
        }else if(initialSelect.equalsIgnoreCase("exit")){
            running=false;
        }else if (initialSelect.equalsIgnoreCase("#load"))
        {
           Loading.LoadingProc();
        }else{
            
        }
    }

    //initial display
    static String initialdisplay(){
        String number;
        System.out.println("================================");
        System.out.println("=   VIRTUAL MOBILE SERVICE     =");
        System.out.println("================================");
        System.out.println("=                              =");
        System.out.println("=       1      2      3        =");
        System.out.println("=                              =");
        System.out.println("=       4      5      6        =");
        System.out.println("=                              =");
        System.out.println("=       7      8      9        =");
        System.out.println("=                              =");
        System.out.println("=       *      0      #        =");
        System.out.println("=                              =");
        System.out.println("================================");
        System.out.println("=     Enter *143# to enter     =");
        System.out.println("=        Mobile Service        =");
        System.out.println("=                              =");
        System.out.println("=     Enter #Load to load      =");
        System.out.println("=         your device          =");
        System.out.println("=                              =");
        System.out.println("=     Enter Exit to Exit       =");
        System.out.println("================================");
        System.out.println("     ");

        do{
            System.out.print("Enter USSD code: ");
            number = ussd.nextLine();

            if(!number.equalsIgnoreCase("*143#") && !number.equalsIgnoreCase("exit") && !number.equalsIgnoreCase("#load") && !number.equalsIgnoreCase("sean")){
                System.out.println("Invalid USSD code - Please enter again");
            }
            else if(number.equalsIgnoreCase("sean")){
                return number;
            }
            else if(number.equalsIgnoreCase("*143#")){
                return number;
            }
            else if(number.equalsIgnoreCase("#load")){
                return number;
            }
        }while(!number.equalsIgnoreCase("exit") && !number.equalsIgnoreCase("sean"));

        System.out.println("Thank you for using VMS!");

        return number;
    }
    //account selection
    static int accSelection(){
        int select = 0;

        System.out.println("");
        System.out.println("Current Bal " +bal +"\n" +
                "1  MyAccount\n" +
                "2  Go+\n" +
                "3  SuperGo99\n" +
                "4  GoEXTRA\n" +
                "5  UNLI 5G\n" +
                "6  Go\n" +
                "7  GoBOOSTERS\n" +
                "8  Surf4All\n" +
                "9  ALLNET\n" +
                "10 GlobeONE\n" +
                "11 Rewards\n" +
                "12 Loans\n" +
                "13 Exit");

        do{
            select = Helper.selectOption();

            if(select > 13) {

            }
            else {
                return select;
            }

        } while (select > 13);

        return select;


    }

    //Subscription Process
    public static void subscription(String type, int price){
        Helper.clearTerminal();
        if(bal >= price){
            double rbal = bal - price;
            System.out.println("Thank you for subscribing to " + type + "! You will get a response via text shortly.\n");
            System.out.print("remaining balance : " + rbal);
        }else{
            System.out.println("insufficient Balance, reload your account!");
            System.out.print("remaining balance : " + bal);
            System.exit(0);
        }
    }

}

