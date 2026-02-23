public class InheritanceMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        System.out.println(c.seats);
        //c.displayFerrari();

        Ferrari f = new Ferrari();
        f.displayFerrari();
        f.display();
        System.out.println(f.seats);

        Car cf = new Ferrari();
        System.out.println("CF : " + cf.seats);
        cf.display();
        //cf.displayFerrari();

        //Ferrari fc = new Car();


    }
}
