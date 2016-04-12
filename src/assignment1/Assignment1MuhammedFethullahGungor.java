
package assignment1;

import java.util.Scanner;

public class Assignment1MuhammedFethullahGungor {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of lines: ");
        int n = input.nextInt();
        Scanner input2=new Scanner(System.in);
        System.out.println("Please enter your choice which pattern you want to use: "
                + "(1=pattern1, 2=pattern2)");
        int pattern= input2.nextInt();
        if (pattern==1){
            displayPattern1(n);
        }
        else{
            displayPattern2(n);
        }
        
    }

    private static void displayPattern1(int n) {
        
        for (int i=1; i<=n; i++){
            
            for (int j=1; j<=(n-i); j++){
                
                int numofdig=0;//numofdig means digits of the number.
                int r = n-(j-1);//the meaning of the variable r is remainder
                while (r!=0){
                    numofdig++;
                    r /=10;
                }    // end of the while loop.
                for (int x = -1; x < numofdig; x++){
                    System.out.print(" ");
                }//end of the 3rd for loop
            }//end of the 2nd for loop
            
            
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }// end of the 4th for loop
            System.out.println();
        }//end of the 1st for loop
    }//end of the private static void
    private static void displayPattern2(int n){
        int m=1;
        for (int i=1; i<=n; i++){
            
            for (int j=n; j>=1; j--){
                if(j>i){
                    
                    System.out.print("    ");
                }
                else{
                    
                    System.out.printf("%4d",m++);
                }
                //}//end of the 3rd for loop
            }//end of the 2nd for loop
            System.out.println();
        }//end of the 1st for loop
    }
}
