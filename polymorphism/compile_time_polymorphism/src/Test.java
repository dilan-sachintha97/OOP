public class Test {

    // Compile time Polymorphism
    //Method over loading => same method name and different parameters
    public static void main(String[] args) {
        myMethod();
        myMethod(5);
    }

    public static void myMethod(){
        System.out.println("Hello Java");
    }

    public  static void myMethod(int x){
        System.out.println("Hello JavaFx");
    }
}
