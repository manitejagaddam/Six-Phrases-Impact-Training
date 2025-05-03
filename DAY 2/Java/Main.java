// in java the format specifiers we have is 
//          %d, %f, %s, %x, %o, %%


// if we print teh class object tehn it will print the defaults toString() method
// public String toString(){
//     return getClass().getName() + "@" + integer.toHexString(hashCode());
// }




import java.util.Scanner;

class Student {
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + this.name;
    }
}

public class Main {
    public static void main(String[] args){

        // this args is used to take teh run time variables;
        // for(int i = 0 ; i < args.length ; i++){
        //     System.out.println(args[i]);
        // }






        // int a = 55;
        // int b = 98;
        // System.out.printf("%05d\n", a);
        // System.out.printf("%5d", b);






        // wap to accept the ascii number and print the respective character

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.printf("%c", n);





        // Student s1 = new Student(100, "Mani");
        // Student s2 = new Student(101, "Teja");
        // Student s3 = new Student(100, "Mani");
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s2));





        // wap to accept an number and if number is 1 print 2 and if number is 2 print 1 without using conditional statements
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(3 - n);





        // write a program to check what type of triagle it is based on three given sides a, b, c
        // if all 3 sides are equal -- equilateral
        //  if any 2 sides are equal -- isosceles
        // if all 3 sides are unequall -- scalen
        // A triangle is valid only id sum of any two sides are greater than the third side

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a + b > c && b + c > a && c + a > b){
        //     if(a == b && a == c){
        //         System.out.println("Equilateral Triangle");
        //     }else if(a == b || a == c || b == c){
        //         System.out.println("Isosceles Triangle");
        //     }else{
        //         System.out.println("Scalene Triangle");
        //     }
        // }else{
        //     System.out.println("Triangle is Not Vaild");
        // }






        // wap to detect the magic number
        // A magic Number is one where the sum of digits are repeated until a single digit becomes 1.


        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // if((n - 1) % 9 == 0) {
        //     System.out.println("Magic Number");
        // }else{
        //     System.out.println("Not a magic Number");
        // }



        // Tax Calculator

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Your Salary : ");
        // double salary = sc.nextDouble();
        // int tax = 0;

        // if(salary <= 1200000){
        //     tax = 0;
        // }else if (salary <= 1600000){
        //     tax = 15;
        // }else if(salary <= 2000000){
        //     tax = 20;
        // }else if(salary <= 2400000){
        //     tax = 25;
        // }else{
        //     tax = 30;
        // }

        // double taxAmount = (salary / 100) * tax;

        // System.out.println("You Need to Pay " + taxAmount + " Rupees as Tax");




    }
}
