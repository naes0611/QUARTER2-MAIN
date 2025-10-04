

import java.util.*;

public class Array_Level_2_YAUDER {
    public static void main(String[] args) {
        Scanner Array = new Scanner(System.in);
        
        System.out.print("Enter number of rooms in the hospital: ");
        int numRooms = Array.nextInt();
        
        int[][] hospital = new int[numRooms][];
        
        for(int i=0; i<numRooms; i++){
            System.out.print("Enter number of patients inside the room "+(i+1)+": ");
            int numPatients = Array.nextInt();
            hospital[i] = new int[numPatients];
        }
        
        // display
            System.out.println("\n===Hospital Info===");
                for (int i = 0; i < hospital.length; i++) {
                    System.out.println("\nRoom "+(i+1)+":\n");
                    for (int j = 0; j < hospital[i].length; j++) {
                        System.out.println("Patient "+(j+1)+" ");
                    }
                    
                }
        Array.close();
    }
}
