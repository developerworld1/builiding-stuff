package Java;

import java.util.Scanner;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("learning Java");
        //problem 1
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if ( x>y){
            System.out.println("X is greater " + x);    
        }
        else{
            System.out.println("Y is greater " + y);
        }
        //PROBLEM 2 
        if ( x % 2 ==0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is even");
        }
        //problem 3 
        if ( x % 7 ==0){
            System.out.println("Is divisible by 7");
        }
        else{
            System.out.println(" Not divisible by 7");
        }
        //problem 4
        if(x % 10 ==4){
            System.out.println("Last digit is 4");
        }
        else{
            System.out.println("Isn't 4");
        }
        //starting new topic from here
        
    }
}