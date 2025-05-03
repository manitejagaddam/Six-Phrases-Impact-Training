// Arrya decleration
// DataType [] ArrayName  java style
// DataType ArrayName []  c++ style

// Array Initialization
// arrayName = new type[size]

// Types of arrays 
// -- 1D Array
// -- Multidimentional Array
// -- jagged Array

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        
        // int [] src={1, 2, 3, 4, 5};
        // int [] copyarr=new int[3];
        // System.arraycopy(src,2, copyarr, 0, 3);
        // System.out.println(Arrays.toString(copyarr));

        // int [] arr = {22, 3, 44, 55, 6, 77, 8, 99};
        // for(int i : arr){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // int maxi = Integer.MIN_VALUE;
        // for(int i : arr){
        //     maxi = Math.max(maxi, i);
        // }
        // System.out.println(maxi);

        // int [][] a = {{1, 2, 3}, {4, 5, 6}};
        // int [][] b = {{10, 20, 30}, {40, 50, 60}};
        // int [][] sum = new int[2][3];
        // for(int i = 0 ; i < 2 ; i++){
        //     for(int j = 0 ; j < 3 ; j++){
        //         sum[i][j] = a[i][j] + b[i][j];
        //     }
        // }

        // for(int [] i : sum){
        //     for(int j : i){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // wap to count the number of odd and even numbers in array

        // int [] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
        // int oddCount = 0;
        // int evenCount = 0;
        // for(int i : arr){
        //     if(i % 2 == 0) evenCount++;
        //     else oddCount++; 
        // }
        // System.out.println("EVEN COUNT " + evenCount + "\nODD COUNT " + oddCount);
        
        // int start = 0;
        // int end = arr.length - 1;
        // while(start < end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // System.out.println(Arrays.toString(arr));
        // for(int i : arr){
        //     System.out.print(i + " ");
        // }
        // int sum = 0;
        // for(int i : arr){
        //     sum += i;
        // }
        // double avg = sum / arr.length;
        // System.out.println("\nSum : " + sum + "\nAverage : " + avg);


        String [] names = {"maniteja", "gaddam", "venkatanarasimha", "pracheykumar"};
        for(String i : names){
            System.out.print(i + " ");
        }
        System.out.println();
        for(String i : names){
            String rev = new StringBuilder(i).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}
