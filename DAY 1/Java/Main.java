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



class Main {
  
  
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
  }
}