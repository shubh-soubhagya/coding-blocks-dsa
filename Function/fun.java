public class fun {
    public static void main(String[] args){

        fun1();
        sum(1,2);
        // System.out.println("Sqaure: "+sq(5));

        for(int i=0; i<100; i++){
            System.out.println("Sqaure: "+sq(i));
        }

        sum(5, 7, 8);

    }

    public static void fun1(){
        System.out.println("Hello World");
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sq(int a){
        return(a*a);
    }

    // Method Overloading
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
