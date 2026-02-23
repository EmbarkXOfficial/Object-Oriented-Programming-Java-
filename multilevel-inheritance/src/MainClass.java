public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();

        B b = new B();
        b.methodA();
        b.methodB();
        //b.methodC();

        C c = new C();
        c.methodC();
        c.methodB();
        c.methodA();

    }
}
