
public abstract class IPhone {
    String model="iphone_13_pro_max";

    public void call(){
        System.out.println("calling");
    }
    public abstract void message();
}

class IphoneNew extends Iphone_1{
    public void message(){
        System.out.println("messaging");
    }
}
