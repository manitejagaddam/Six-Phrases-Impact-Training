import java.util.Scanner;
public class DivisibleBy3and5 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        // Brute Force Method
        // int sum = 0;
        // for(int i = 0 ; i < n ; i++){
        //     if(i % 3 == 0 || i % 5 == 0) sum += i;
        // }
        // System.out.println(sum);


        // Better Method
        // int sum = 0;
        // for(int i = 3 ; i < n ; i += 3){
        //     sum += i;
        // }
        // for(int i = 5 ; i < n ; i += 5){
        //     sum += i;
        // }
        // for(int i = 15 ; i < n ; i += 15){
        //     sum -= i;
        // }
        // System.out.println(sum);


        // Optimal Solution
        int sum = 0;
        int n3 = (n - 1) / 3;
        int n5 = (n - 1) / 5;
        int n15 = (n - 1) / 15;
        sum += 3 * ((n3 * (n3 + 1)) / 2);
        sum += 5 * ((n5 * (n5 + 1)) / 2);
        sum -= 15 * ((n15 * (n15 + 1)) / 2);
        System.out.println(sum);

    }
}
