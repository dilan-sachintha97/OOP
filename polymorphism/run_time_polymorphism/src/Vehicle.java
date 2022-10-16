public class Vehicle {
    // Run time Polymorphism
    //Method overriding => compiler think that should run park() method inherited from super class, but actually park() method in sub class

    public void park() {
        System.out.println("Park the vehicle");
    }
}

class Van extends Vehicle {
    public void park() {  //method overriding
        System.out.println("Park the van  here");
    }
}

class Car extends Vehicle {
    public void park() {  //method overriding
        System.out.println("Park your car by yourself");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.park();  //Park your car by yourself
    }
}


