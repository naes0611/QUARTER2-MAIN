package VMSOptions;

import static Main.VirtualMobileService.*;


public class Helper {
    //clearing terminal
    public static void clearTerminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static int selectOption() {
        

       int number =0;
        
        while (true) {
            System.out.print("Select your choice: ");

            //ussd.hasNextInt()
            if (ussd.hasNextInt()) {// this checks if the input is int
                number = ussd.nextInt();
                break;// breaks loop
            } else if (ussd.hasNextLine()){
                String conf =  ussd.nextLine();
                   if(conf.equalsIgnoreCase("exit"))
                   {
                       System.out.println("Exiting..");
                       try{
                           Thread.sleep(2000);
                       System.exit(0);
                       }catch(InterruptedException e){
                           
                       }
                       }
                break;// breaks loop
            }
            else {
                ussd.next();
            }
        }
        return number;
    }
    public static String getNextLine() {
        return ussd.nextLine();
    }
}