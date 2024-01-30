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
        //printing square or rectangle
        for(rowIndex=1;rowIndex<=rowNumber;rowIndex++){
            for(colIndex=1;colIndex<=colNumber;colIndex++){
                System.out.print("*");
            }
            System.out.println();
        }
        //printing the same no in that column for n row
        for(rowIndex=1;rowIndex<=rowNumber;rowIndex++){
            for(colIndex=1;colIndex<=rowIndex;colIndex++){
                System.out.print(rowIndex);
            }
            System.out.println();
        }

    }
}
