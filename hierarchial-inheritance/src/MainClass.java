public class MainClass {
    public static void main(String[] args) {
        B b = new B();
        b.methodB();
        b.methodA();
        //b.methodC();

        C c = new C();
        c.methodC();
        c.methodA();
        //c.methodB();

    }
}
