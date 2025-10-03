package VMSOptions;


import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.ussd;
import static Main.VirtualMobileService.subscription;

public class AllNet {
    public static void AllNetProc(){
        int select;
        int option = 0;
        boolean isDone = false;
        boolean isDone2 = false;
        System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
        String BM;
        do {
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 GoUnli20\n" +
                    "2 GoUnli30\n" +
                    "3 GoUnli50\n" +
                    "4 GoUnli95\n" +
                    "5 GoUnli180\n" +
                    "6 GoUnli350\n" +
                    "7 Back");


            select = Helper.selectOption();

            if(select > 7) {
                
            }
            else {
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        System.out.println("GoUNLI20 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();
                        
                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI20",20);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);
                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;
                    case 2:
                        System.out.println("GoUNLI30 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();

                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI30",30);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);
                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;

                    case 3:
                        System.out.println("GoUNLI50 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();

                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI50",50);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);

                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;

                    case 4:
                        System.out.println("GoUNLI95 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();

                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI95",95);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);
                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;

                    case 5:
                        System.out.println("GoUNLI180 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();

                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI180",180);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);
                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;


                    case 6:
                        System.out.println("GoUNLI350 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();

                        if(option == 3){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoUNLI350",350);
                            isDone = true;
                            running = false;
                        }else if(option == 2){
                            isDone=true;
                            do{Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
                            isDone2=true;
                            
                            running=false;
                            }else if (select==1){
                            try{
                                Thread.sleep(1000);
                                System.out.println("Returning..");
                                try{
                                    Thread.sleep(1000);
                                    isDone2=true;
                                    
                                    running=true;
                                }catch(InterruptedException e){
                                    
                                }
                            }catch(InterruptedException e){
                                    
                                }

                        }else{
                            
                            }

                        }while(!isDone2);
                        }
                        else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");

                            BM = ussd.nextLine();


                        }else{
                            
                        }

                        break;


                    case 7:
                        running = true;
                        isDone = true;
                        break;
                }
            }
        } while (!isDone);
    }
}
