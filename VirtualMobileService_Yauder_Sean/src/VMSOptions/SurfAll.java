package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.ussd;


public class SurfAll {
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDoneGroup = false;
    static boolean isDoneRemoveMember = false;
    static boolean isDoneLeaveGroup = false;
    static boolean isDoneSub = false;
    static String name;
    public static void SurfAllProc(){
        
        
        do{
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                "purchase your promos via GlobeOne.\n" +
                "Download the app now\n" +
                "\n" +
                "1 Surf4All 99\n" +
                "2 Surf4All 249\n" +
                "3 Status\n" +
                "4 Manage your group\n" +
                "5 Back");
            
            select = Helper.selectOption();
            
            if(select > 5){
            }else{
                Helper.clearTerminal();
                switch(select){
                    case 1:
                       
                            System.out.println("Earn 1 Rewards point if you register to this via\n" +
                            "GlobeOne.\n" +
                            "9GB all-access and shareable data for all, valid\n" +
                            "for 7 days, P99\n" +
                            "\n" +
                            "1 Subscribe\n" +
                            "2 Back");
                            
                            option = Helper.selectOption();
                            
                            if(option > 2){
                                
                            }else{
                                Helper.clearTerminal();
                                switch(option){
                                    case 1:
                                        System.out.println("Thank you for registering!\n" + "1 Manage your group");
                                        
                                        select = Helper.selectOption();
                                        
                                        
                                        if(select > 1){
                                            Helper.clearTerminal();
                                            System.out.println("Invalid Selection, Mobile Service Terminated");
                                            isDone = true;
                                            running = false;
                                        }else{
                                            
                                            switch(select){
                                                case 1:
                                                    ManageGroup();
                                                    break;
                                                        
                                            }
                                        }
                                        break;
                                    case 2:
                                        isDone=false;
                                        break;
                                    default:
                                }
                            }
                        break;
                    case 2:
                        System.out.println("Earn 4 Rewards point if you register to this via\n" +
                                       "GlobeOne.\n" +
                                       "20GB all-access and shareable data for all,\n" +
                        "valid for 7 days, P249\n" +
                        "\n" +
                        "1 Subscribe\n" +
                        "2 Back");
                        option = Helper.selectOption();
                            
                            if(option > 2){
                                
                            }else{
                                Helper.clearTerminal();
                                switch(option){
                                    case 1:
                                        System.out.println("Thank you for registering!\n" + "1 Manage your group");
                                        
                                        select = Helper.selectOption();
                                        
                                        
                                        if(select > 1){
                                        Helper.clearTerminal();
                                            System.out.println("Invalid Selection, Mobile Service Terminated");
                                            isDone = true;
                                            running = false;
                                        }else{
                                            
                                            switch(select){
                                                case 1:
                                                    ManageGroup();
                                                    break;
                                                        
                                            }
                                        }
                                        break;
                                    case 2:
                                        isDone=false;
                                        break;
                                }
                            }
                        break;
                    case 3:
                        System.out.println("Thank you! You will get a response via text shortly.");
                        isDone=true;
                        running=false;
                        break;
                    case 4:
                        ManageGroup();
                        break;
                    case 5:
                        isDone = true;
                        running = false;
                        break;
                    default: 
                }
                
            }
          
        }while(!isDone);
    }
    static void ManageGroup(){
        do{
            Helper.clearTerminal();
            System.out.println("You can conveniently manage your account\n" +
                                "with GlobeOne. Download the app now!\n" +
                                "\n" +
                                "1 Add Member\n" +
                                "2 Set Limit\n" +
                                "3 Remove Member\n" +
                                "4 Leave Group");

            option = Helper.selectOption();
            
            if(option > 4){
                Helper.clearTerminal();
                System.out.println("Invalid Selection, Mobile Service Terminated");
                isDoneGroup = true;
                isDone=true;
                running = false;
            }else{
                Helper.clearTerminal();
                switch(option){
                    case 1:
                        System.out.println("Add members to your group by replying with\n" +
                            "their mobile number (ex. 9171234567). Free of\n" +
                            "charge");
                        name = ussd.nextLine();
                        isDoneGroup=true;
                        isDone=true;
                        running=false;
                        break;
                    case 2:
                        System.out.println("You can set a limit for the members of your\n" +
                            "group. Owners don't have a limit.\n" +
                            "\n" +
                            "1 500MB\n" +
                            "2 1GB\n" +
                            "3 2GB\n" +
                            "4 3GB\n" +
                            "5 4GB\n" +
                            "6 Back");
                        select = Helper.selectOption();
                        if(select > 6){
                            
                        }else{
                            Helper.clearTerminal();
                            switch(select){
                                case 1:
                                    System.out.println("Enter the mobile number of your group\n" +
                                    "member who will get a 500MB limit.\n" +
                                    "(ex. 9171234567).");
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    running = false;
                                    break;
                                case 2:
                                    System.out.println("Enter the mobile number of your group\n" +
                                "member who will get a 1GB limit.\n" +
                                "(ex. 9171234567).");
                                    
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    running = false;
                                    break;
                                case 3:
                                    System.out.println("Enter the mobile number of your group\n" +
                                    "member who will get a 2GB limit.\n" +
                                    "(ex. 9171234567).");
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    running = false;
                                    break;
                                case 4:
                                    System.out.println("Enter the mobile number of your group\n" +
                                    "member who will get a 3GB limit.\n" +
                                    "(ex. 9171234567).");
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    running = false;
                                    break;
                                case 5:
                                    System.out.println("Enter the mobile number of your group\n" +
                                    "member who will get a 4GB limit.\n" +
                                    "(ex. 9171234567).");
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    running = false;
                                    break;
                                case 6:
                                    isDoneGroup=false;
                                    break;
                                
                            }
                        }
                        break;
                    case 3:
                        do{
                        System.out.println("1 Remove a member from your group\n" +
                            "2 Remove all members from your group\n" +
                            "3 Back");
                        option = Helper.selectOption();
                        
                        if(option > 3){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Enter the member's mobile number (ex.\n" +
                                    "9171234567).");
                                    name = ussd.nextLine();
                                    isDoneGroup = true;
                                    isDone=true;
                                    running = false;
                                    break;
                                case 2:
                                    System.out.println("You are about to remove all your members\n" +
                                    "from your SHARE&SURF promo.\n" +
                                    "\n" +
                                    "1 Yes\n" +
                                    "2 Back");
                                    select = Helper.selectOption();
                                    if(select > 2){
                                    }else{
                                        Helper.clearTerminal();
                                        switch(select){
                                            case 1:
                                                System.out.println("Thank you! You will get a response via text shortly.");
                                                isDoneRemoveMember=true;
                                                isDoneGroup=true;
                                                isDone=true;
                                                running = false;
                                                break;
                                            case 2:
                                                isDoneRemoveMember=false;
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    isDoneGroup = false;
                                    break;
                            }
                        }
                        }while(!isDoneRemoveMember);
                        break;
                    case 4:
                        do{
                        System.out.println("Are you sure you want to leave your group?\n" +
                        "\n" +
                            "1 Yes\n" +
                            "2 Back");
                        option = Helper.selectOption();
                        
                        if(option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("1 Enter group owner's mobile number\n" +
                                    "2 Check group owner's mobile number\n" +
                                    "3 Back");
                                    select = Helper.selectOption();
                                    
                                    if(select >3){
                                    }else{
                                        Helper.clearTerminal();
                                        switch(select){
                                            case 1:
                                                System.out.println("Enter the mobile number of your group owner\n" +
                                                "(ex. 9171234567).");
                                                name = ussd.nextLine();
                                                isDoneLeaveGroup=true;
                                                isDoneGroup=true;
                                                isDone=true;
                                                running = false;
                                                break;
                                            case 2:
                                                System.out.println("Thank you! You will get a response via text shortly.");
                                                isDoneLeaveGroup=true;
                                                isDoneGroup=true;
                                                isDone=true;
                                                running = false;
                                                break;
                                            case 3:
                                                isDoneLeaveGroup=false;
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    isDoneGroup=false;
                                    break;
                                }
                            }
                        }while(!isDoneLeaveGroup);
                        break;
                }
            }

        }while(!isDoneGroup);
    }
}
