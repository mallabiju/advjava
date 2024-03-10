package G_Inheritance;

class BaseClass {
    public void hi() {
        System.out.println("Hi from base class.");
    }
}

class DerivedClass extends BaseClass {
    public void hi() {
        System.out.println("Hi from derived class.");
    }
}

public class d_single_same_method {
    public static void main(String[] args) {
        DerivedClass obj1 = new DerivedClass();
        // DerivedClass obj2 = new BaseClass();
        obj1.hi();
        // obj2.hi();
    }
}
