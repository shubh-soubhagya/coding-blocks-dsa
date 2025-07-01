public class function {
    public static void main(String[] args){
        System.out.println("Hello");
        Meow();
        Meow1();
        Meow(); //Line by line execution
    }

    public static void Meow(){
        System.out.println("Say Meow");
    }

    public static void Meow1(){
        System.out.println("Mewo1");
        Meow();
        System.out.println("Meow Meow");
    }
}
