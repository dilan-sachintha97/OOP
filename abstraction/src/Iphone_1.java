public class Iphone_1 {  // concrete class
    public void call(){
        System.out.println("Calling...."); // concrete method
    }
}

 abstract class Iphone_2{
    public void call(){
        System.out.println("Calling....");  // concrete method -> have a method body
    }

    public abstract void message();  // abstract method -> no method body
}

abstract class Iphone_3{
    public abstract void message();
    public abstract void chat();
    // an abstract class has only abstract methods, this class called fully abstract class
    // Fully abstract class == interface

//    when inheritance{
//            calss -> extands
//            interface -> implements
//     }
}
