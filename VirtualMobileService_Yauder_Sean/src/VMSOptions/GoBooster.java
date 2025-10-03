package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;

public class GoBooster {

    public static void GoBoosterProc(){
        int select;
        int option = 0;
        boolean isDone = false;

        do {

            Helper.clearTerminal();
            System.out.println("Add more with your Go promo by registering to\n" +
                    "any of the following GoBOOSTERS:\n" +
                    "\n" +
                    "1 GoBOOST15\n" +
                    "2 GoWATCH10\n" +
                    "3 GoPLAY10\n" +
                    "4 GoSHARE10\n" +
                    "5 More\n" +
                    "6 Back");


            select = Helper.selectOption();

            if(select > 3) {;
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
                            System.out.println("Invalid choice, program terminated");
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
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;
                    case 3:
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
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;

                    case 4:
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
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;
                    case 5:
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
                            System.out.println("Invalid choice, program terminated");
                            isDone = true;
                            running = false;
                        }

                        break;
                    case 6:
                        running = true;
                        isDone = true;
                        break;
                }
            }
        } while (!isDone);
    }
}
