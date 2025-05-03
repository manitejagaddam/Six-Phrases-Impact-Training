// in java the format specifiers we have is 
//          %d, %f, %s, %x, %o, %%



public class Main {
    public static void main(String [] args){

        // this args is used to take teh run time variables;
        // for(int i = 0 ; i < args.length ; i++){
        //     System.out.println(args[i]);
        // }

        int a = 55;
        int b = 98;
        System.out.printf("%05d\n", a);
        System.out.printf("%5d", b);
    }
}
