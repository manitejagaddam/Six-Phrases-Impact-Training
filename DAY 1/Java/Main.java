// Input types
// next() -> takes the input and returns a string
// nextInt() -> takes the input and returns an integer
// nextFloat() -> takes the input and returns a float
// nextDouble() -> takes the input and returns a double
// nextLine() -> takes the input and returns a string and moves to next line

import java.util.Scanner;

class Test {
    int num1;
    String s;

    public Test(){
        // num1 = 10;
        // s = "Hello";
    }

    public void wrappers(){
        int k = 10;
        Integer i = k;       // this is a wrapper classes
        int j = i;
        System.out.println(i + " " + j + " " + k);
    }
    public void print(){
        System.out.println(num1 + " " + s);
        System.out.println(10 + 5 + " hello");
        System.out.println("hello " + 10 + 5);
    }

}


// class Main extends Object{}  // every class would inherit from object class
class Object {
    // This is the default implementation of toString() in Object class which is a parent class of all classes
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
}


class Main {
  
  
    public static void main(String[] args) {
        // Test t = new Test();
        // t.print();
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        double db = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(s + " " + db + " " + n);
    
  }
}