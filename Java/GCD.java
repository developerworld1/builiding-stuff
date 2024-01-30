package Java;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         //Finding GCD/HCF
         //Created Scanner, taking input now 
         System.out.println("Enter the first number: ");
         int A = sc.nextInt();
         System.out.println("Enter the second number: ");
         int B = sc.nextInt();
         sc.close();
         int lowestOfAB = 0;

        //finding the lowest of A n B , it can 
        // done with 1 line too but i'm doing like this 
         if(A<B){
             lowestOfAB +=A;
         }
         else{
             lowestOfAB+=B;
         }
         //initializing few supporting variable
         int ind;
         int GCD = 1;
          
        //looping till the min of A and B
         for(ind=1;ind<=lowestOfAB;ind++){
             if(A%ind==0 && B%ind==0){
                 GCD= ind;
             }
         }
         //updating the calcuated GCD
         System.out.println("GCD :"+GCD);
    }
}
