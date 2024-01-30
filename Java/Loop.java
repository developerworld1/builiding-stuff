package Java;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("For loop...");
        int index;
        //for loop starting
        for ( index=1; index<= 10;index++){
            System.out.println(index);
        }
        //while loop starting
        System.out.println("While Loop...");
        while(index<=20){
            System.out.println(index);
            index++;
        }
        //mathematical problem starting
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int i;
        int divisorCount =0;
        System.out.println("Divisior Checking..!");
        for(i=1;i<=x;i++){
            if (x%i==0) {
                System.out.println(i);
                divisorCount++;
            }
            
        }
        //updating total divisor count
        System.out.println("Total Divsior: "+ divisorCount);
        //checking for prime or compound no.
        if(divisorCount==2){
            System.out.println("No. you gave is prime:"+ x);
        }
        else{
            System.out.println("This Number is Compound no: "+ x);
        }
        
       
    }
}
