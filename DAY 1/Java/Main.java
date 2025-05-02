class Test {
    int num1;
    String s;

    public Test(){
        // num1 = 10;
        // s = "Hello";
    }

    public void print(){
        System.out.println(num1 + " " + s);
    }

}



class Main {
  
  
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
  }
}