public class Animal {
    public String eye;
    public String legs;
    public String mouth;
    private String head;
    public static String tail;

    public void eat(){
        System.out.println("Eet something");
    }
}

class Dog extends Animal{

    public void testMethod(){
        System.out.println(eye);
        System.out.println(tail);
//        System.out.println(head);
    }
}

class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.testMethod();
    }
}
