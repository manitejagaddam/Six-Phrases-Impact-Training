import java.util.Scanner;
class AddTwoConsecutive{
    int finNumber(int n){
        int num = 0;
        num = (n - 1) / 2;
        return num;
    }
}

class AddThreeConsecutive{
    int findNumber(int n){
        int num = 0;
        num = n / 3 - 1;
        return num;
    }
}

class LargerAndDivisible{
    int findNum(int n1, int n2){
        int ans;
        ans = ((n1 / n2) + 1) * n2;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        // Q no 1: Given a number n which is the sum of two contigueous number
        AddTwoConsecutive addTwo = new AddTwoConsecutive();
        Scanner kbd = new Scanner(System.in);
        int n1 = kbd.nextInt();
        int twoNums = addTwo.finNumber(n1);
        System.out.printf("Numbers %d and %d can form %d\n", twoNums, twoNums + 1, n1 );
        
        // Q no 2: Given a number n which is the sum of three contigueous number
        kbd.nextLine();
        int n2 = kbd.nextInt();
        AddThreeConsecutive addThree = new AddThreeConsecutive();
        int threeNums = addThree.findNumber(n2);
        System.out.printf("Numbers %d, %d and %d can form %d\n", threeNums, threeNums + 1, threeNums + 2, n2);

        // Q no 3: Given n1 and n2 find the values x, such that x is larger than n1 and divisible by n2 
        // test Cases : n1 = 40, n2 = 12      x = 48
        kbd.nextLine();
        int a = kbd.nextInt();
        kbd.nextLine();
        int b = kbd.nextInt();

        LargerAndDivisible largeDiv = new LargerAndDivisible();
        int x = largeDiv.findNum(a, b);
        System.out.printf("The Required Number is : %d", x);
        
        

    }
}
