package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class SuperGo99 {
    public static void SuperGo99Proc(){
        int option = 0;
        Helper.clearTerminal();
        System.out.println("Enjoy data for 15 days with GoDEALS!\n" +
                "SuperGo99 comes with 7GB for all sites + unli\n" +
                "all-net texts, valid for 15 days. Register via\n" +
                "GlobeOne to earn 1.98 points.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");

        option = Helper.selectOption();

        if(option == 2){
            running = true;
        }else if(option == 1){
            subscription("SuperGo99",99);
            running = false;
        }else{
            System.out.println("Invalid Selection, Transaction Terminated");
            running = false;
        }
    }
}
