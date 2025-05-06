// TIP FOR SOLVING NUMBER THEORY PROBLEMS
    // 1) List out all the test cases minimum 10 testcases
    // 2) Now Find the pattern hidden in the series of answers
    // 3) Code the identified pattern

import java.util.Scanner;

public class CombinationOfNumbers {
    public static void main(String[] args) {
        // Give a number print the number sequence where sum of those sequence is equall to the given number and the product is maximum.
        // Test Cases:
            // 4 -> 2 2
            // 6 -> 3 3
            // 10 -> 2 2 3 3
        
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        if(n % 3 == 0) {
            while(n > 0){
                System.out.print(3 + " ");
                n -= 3;
            }System.out.println();
        }else if(n % 3 == 1){
            System.out.print(2 + " " + 2 + " ");
            n -= 4;
            while(n > 0){
                System.out.print(3 + " ");
                n -= 3;
            }
        }else{
            System.out.print(2 + " ");
            n -= 2;
            while(n > 0){
                System.out.print(3 + " ");
                n -= 3;
            }
        }
    }
}
