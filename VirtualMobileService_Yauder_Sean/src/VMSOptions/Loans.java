package VMSOptions;

import static Main.VirtualMobileService.running;

public class Loans {
    static int select;
    static int option;
    static boolean isDone = false;
    static boolean isDoneUnsub = false;
    static boolean isDoneUnsub2=false;
    public static void LoansProc(){
        do{
            Helper.clearTerminal();
            System.out.println("Globe Loans will move to GlobeOne soon.\n"+
                    "Download the app now!]\n"+"1 MBSOS/FOMOSOS\n"+"2 COMBOSOS\n"+
                    "3 TXTSOS\n"+"4 CALLSOS\n"+"5 IDDSOS\n"+"6 Pay Loan\n"+
                    "7 Status\n"+"8 Unsubscribe\n"+"9 Back");
            select = Helper.selectOption();
            if(select > 9){
                
            }else{
                Helper.clearTerminal();
                switch(select){
                    case 1:
                        System.out.println("MBSOS or FOMOSOS lets you borrow 100MB for\nsurfing valid for 1 day. Pay later by buying \nat least P6 (P5 + P1 servive fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                        if (option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 2:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("COMBOSOS lets you borrow 2 minute calls and\n 5 all-net texts valid for 1 day. Pay later by buying\nat least P6 (P5 + P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                        if (option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 2:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;    
                    case 3:
                        System.out.println("TXTSOS lets you borrow 10 all-net texts valid\nfor 1 day. Pay later by buying at least P6 (P5 +\n P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                        if (option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 2:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;    
                    case 4:
                        System.out.println("CALLSOS lets you borrow 3 min all-net calls,\n validfor 1 day. Pay later by buying at least P6\n(P5 + P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                        if (option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 2:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;    
                    case 5:
                        System.out.println("IDDSOS lets you borrow 1 min call to M. East &\nEurope, N. America & Asia pac. valid for 1 day.\nPay later by buying at least P6 (P5 + P1 service\n fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                        if (option > 2){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 2:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;    
                    case 6://ty
                        System.out.println("Thank you! You will get a response via text shortly.");
                        isDone=true;
                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                        
                        break;    
                    case 7:// 1 load status  2 loan promo status 3 back ty
                        System.out.println("1 Load Status\n2 Loan Promo status\n3 Back");
                        
                        option = Helper.selectOption();
                        if (option > 3){
                        }else{
                            Helper.clearTerminal();
                            switch(option){
                                case 1:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                        isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                        break;
                                case 2:
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                    break;
                                case 3:
                                    isDone=false;
                                    break;
                            }
                        }
                        break;    
                    case 8:// stop mbsos 2 . stop combo 3 others - to unsub 2 back- 4 back then ty
                        do{
                            System.out.println("1 Stop MBSOS\n2 Stop COMBOSOS\n3 Others\n4 Back");
                            option = Helper.selectOption();
                            if (option >4){
                            }else{
                                switch(option){
                                    case 1:
                                        System.out.println("Thank you! You will get a response via text shortly.");
                                        isDoneUnsub=true;
                                        isDone=true;
                                        try{
                                    Thread.sleep(1000);
                                    System.out.println("Returning..");
                                        try{
                                            Thread.sleep(2000);
                                        }catch(InterruptedException e){
                                        }
                                }catch(InterruptedException e){
                                }
                                        break;
                                    case 2:
                                        System.out.println("Thank you! You will get a response via text shortly.");
                                        isDoneUnsub=true;
                                        isDone=true;
                                        try{
                                            Thread.sleep(1000);
                                            System.out.println("Returning..");
                                                try{
                                                    Thread.sleep(2000);
                                                }catch(InterruptedException e){
                                                }
                                        }catch(InterruptedException e){
                                        }
                                        break;
                                    case 3:
                                        do{
                                        System.out.println("To unsubscribe from your Loan Promo just\ntext STOP<space><LOAN PROMO KEYWORD>\nand send to 3733 for free.\n1 Back");
                                        if(select>1){
                                        }else{
                                            switch(select){
                                                case 1:
                                                    isDoneUnsub2=false;
                                                    break;
                                            }
                                        }
                                        }while(!isDoneUnsub2);
                                        break;    
                                    case 4:
                                        isDoneUnsub = false;
                                        break;    

                                }
                            }
                        }while(!isDoneUnsub);
                        break;  
                    case 9:
                        isDone=true;
                        running=false;
                        break;    
                        
                }
            }
        }while(!isDone);
    }
}
