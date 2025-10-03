package VMSOptions;

import static Main.VirtualMobileService.running;


public class GlobeOne {
    static int select=0;
    static int option=0;
    public static void GlobeOneProc() {

        Helper.clearTerminal();
        System.out.println("Thank you! You will get a response via text shortly\n"
                                    + "1 Continue\n"
                                    + "2 Exit" );
                            select = Helper.selectOption();
                            if(select == 2){
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
    }
}
