

import java.util.*;

public class Arrays_Level_3_YAUDER {
    public static void main(String[] args) {
        
        Scanner Array = new Scanner(System.in);
        System.out.print("Enter the number of classes: ");
        int numClasses = Array.nextInt();
        
        // Declare 3D array [number of classes][number of students][number of subjects]
        int[][][] studentGradeRecords = new int[numClasses][][];
        
        for(int i=0; i < numClasses; i++){
            System.out.println("Class "+ (i+1) +":");
            System.out.print("Enter number of students for this class: ");
            int numStudents = Array.nextInt();
            studentGradeRecords[i] = new int [numStudents][];
            for(int j=0; j<numStudents; j++){
                System.out.println("Student "+ (j+1) +":");
                System.out.print("Enter number of Subjects: ");
                int numSubjects = Array.nextInt();
                studentGradeRecords[i][j]= new int[numSubjects];
                for(int k=0; k < numSubjects; k++){
                    System.out.print("Enter the Student's Grade for Subject "+(k+1)+": ");
                    studentGradeRecords[i][j][k] = Array.nextInt();
                }
            }
        }
        // display Student Grade Records
        System.out.println("=====Student Grade Records=====");
            for(int i = 0; i < studentGradeRecords.length; i++ ){
                System.out.println("\nClass "+(i+1)+"");
                for(int j=0; j<studentGradeRecords[i].length; j++){
                    System.out.println("\nStudent "+(j+1)+"");
                    for(int k=0;k<studentGradeRecords[i][j].length;k++){
                        System.out.println("\nSubject "+(k+1)+": "+ studentGradeRecords[i][j][k]);
                    }

                }

            }
        Array.close();
    }
}
