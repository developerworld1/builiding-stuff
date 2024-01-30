package Java;

import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {
        //pattern - square
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row no. :");
        int rowNumber = sc.nextInt();
        System.out.println("Enter the column no. :");
        int colNumber = sc.nextInt();
        sc.close();
        int rowIndex;
        int colIndex;
        //looping 
        for(rowIndex=1;rowIndex<=rowNumber;rowIndex++){
            for(colIndex=1;colIndex<=colNumber;colIndex++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
