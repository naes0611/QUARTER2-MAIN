package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class Unli5G {
    public static void Unli5GProc(){
        int select;
        int option = 0;
        boolean isDone = false;

        do {
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 UNLI 5G 50\n" +
                    "2 UNLI 5G 80\n" +
                    "3 Back");


            select = Helper.selectOption();

            if(select > 3) {
            }
            else {
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        System.out.println("Feel the unlimited 5g experience with UNLI 5G\n" +
                                "50! Get unli 5G data + 2GB data for all sites,\n" +
                                "valid for 2 days for only P50.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone = false;
                        }else if(option == 1){
                            subscription("UNLI 5G 50",50);
                            isDone = true;
                            running = false;
                        }else{
                            System.out.println("Invalid Selection, Transaction Terminated");
                            isDone = true;
                            running = false;
                        }

                        break;
                    case 2:
                        System.out.println("Feel the unlimited 5g experience with UNLI 5G\n" +
                                "data + 2GB data for all sites + unli allnet calls &\n" +
                                "texts, valid for 2 days for only P80.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone = false;
                        }else if(option == 1){
                            subscription("UNLI 5G 80",80);
                            isDone = true;
                            running = false;
                        }else{
                            System.out.println("Invalid Selection, Transaction Terminated");
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
