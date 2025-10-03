package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.ussd;

public class MyAccount {
    public static void MyAccountProc(){
        int select;
        int option = 0;
        boolean isDone = false;
        boolean isDone2 = false;

        do{
            Helper.clearTerminal();
            System.out.println("Manage your Account and check your balance with GlobeOne. Download it now.");
            System.out.println("1 Data Balance\n2 SurfAlert\n3 Load Call Card\n4 My Devices\n5 Back");


            select = Helper.selectOption();

            if(select > 5) {
                
            }
            else {
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            option = Helper.selectOption();
                            if(option == 2){
                            running=false;
                            }else if (select==1){
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(2000);
                                    running=true;
                                }catch(InterruptedException e){
                                }
                        }else{
                            }
                        break;
                    case 2:
                        System.out.println("To register to this service, text SURFALERT ON\n"+
                                "to 8080 now.\n"+"For more info, text SURFALERT to 8080 for\n"+"free.\n"+
                                "1 Back");

                        option = Helper.selectOption();

                        if(option == 1){
                            isDone = false;
                        }else{
                            
                        }

                        break;
                    case 3:
                        System.out.println("Buy load & promos, and enjoy exclusive\n" +
                                "rewards anytime, anywhere with GlobeOne!\n" +
                                "Download the app now via Google Play Store\n" +
                                "or the App Store.\n" +
                                "\n" +
                                "1 Next\n"+
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone = false;
                        }else if(option == 1){
                            Helper.clearTerminal();
                            System.out.println("Enter 10-digit call card number");
                            String enter = ussd.nextLine();
                            ussd.nextLine();
                            isDone = true;
                            running = false;
                        }else{
                            ;
                        }

                        break;
                    case 4:
                        do{
                            Helper.clearTerminal();
                            System.out.println("Easily manage your account with GlobeOne.\n" +
                                    "Download the app now!\n" +
                                    "\n" +
                                    "1 Globe At Home\n" +
                                    "2 Back");

                            option = Helper.selectOption();

                            if(option == 2){
                                isDone2 = true;
                                isDone = false;
                            }else if(option == 1){
                                Helper.clearTerminal();
                                System.out.println("Choose the Globe at Home (Broadband)\n" +
                                        "account that you wish to manage\n" +
                                        "\n" +
                                        "1 Globe At Home Prepaid Wifi\n" +
                                        "2 Back\n");
                                option = Helper.selectOption();
                                switch (option){
                                    case 1:
                                        Helper.clearTerminal();
                                        System.out.println("Please enter your 10-digit Globe At Home\n" +
                                                "Prepaid WiFi number:\n" +
                                                "(Example: 905XXXXXXX)");
                                        String enter = ussd.nextLine();
                                        ussd.next();
                                        isDone2 = true;
                                        isDone = true;
                                        running = false;
                                        break;
                                    case 2:
                                        isDone2 = false;
                                        break;
                                    
                                }
                            }else{
                                
                            }
                        }while(!isDone2);

                        break;
                    case 5:
                        running = true;
                        isDone = true;
                        break;
                }
            }
        } while (!isDone);

    }
    
}
