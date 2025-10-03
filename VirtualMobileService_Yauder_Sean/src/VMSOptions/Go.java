package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class Go {
    public static void GoProc(){
        int select;
        int option = 0;
        boolean isDone = false;

        do {
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 GoEXTRA99\n" +
                    "2 GoEXTRA199\n" +
                    "3 Back");


            select = Helper.selectOption();

            if(select > 3) {
                
            }
            else {
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        System.out.println("Go all-in with GoEXTRA99! Get 8GB for all\n" +
                                "sites, unli all-net calls & texts, valid for 7 days,\n" +
                                "for only P99.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoEXTRA99",99);
                            isDone = true;
                            running = false;
                        }else{
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;
                    case 2:
                        System.out.println("Go all-in for 15 days with GoEXTRA199! Get\n" +
                                "8GB for all sites, unli all-net calls & texts, valid\n" +
                                "for 15 days, for only P199.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone = false;
                        }else if(option == 1){
                            subscription("GoEXTRA199",199);
                            isDone = true;
                            running = false;
                        }else{
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;

                    case 3:
                        running = true;
                        isDone = true;
                        break;
                }
            }
        } while (!isDone);
    }
}
