package VMSOptions;
import Main.VirtualMobileService;
import static Main.VirtualMobileService.running;

public class Loading {
    static boolean isDone=false;
    static double bal;
public static void LoadingProc() {
    
    bal = VirtualMobileService.bal;
    boolean validInput = false;
    do {
        Helper.clearTerminal();
        System.out.println("================================");
        System.out.println("=        Loading System        =");
        System.out.println("================================");
        System.out.println("                                ");
        System.out.println("Enter 'exit' to exit "
                            + "loading system.\n");
        System.out.println("Enter load amount (1-2999): ");

        
        while (!validInput) {
            String input = Helper.getNextLine();

            if (input.equalsIgnoreCase("exit")) {
                
                System.out.println("Returning..");
                try{
                    Thread.sleep(2000);
                    running=true;
                }catch(InterruptedException e){
                    
                }
            } else {
                try{
                    int loadAmount = Integer.parseInt(input); //
                    if (loadAmount >= 1 && loadAmount <= 2999) {
                        bal += loadAmount;
                        System.out.println("Thank you, load processing please wait..");
                        try{
                            Thread.sleep(2000);
                        }catch(InterruptedException e){
                            
                        }
                        System.out.println("Your balance is now: " + bal);
                        try{
                            Thread.sleep(1000);
                            System.out.println("Returning..");
                            try{
                                Thread.sleep(2000);
                                isDone=false;
                                running=true;
                                        
                            }catch(InterruptedException e){
                                
                            }
                        }catch(InterruptedException e){
                            
                        }
                        
                        validInput = true;
                    } else {
                        System.out.println("Invalid input: Please enter a load amount (1-2999) or 'exit'.");
                        System.out.println("Please enter load amount again:");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: Please enter a load amount (1-2999) or 'exit'.");
                    System.out.println("Please enter load amount again:");
                }
            }
        }
    } while (!isDone);
}
}