public class Aeroplane extends Vehicle implements Flyable {

    @Override
    void move() {
        System.out.println("Plane is flying");
    }

    @Override
    public void fly() {
            System.out.println("Plane is flying");
        }
}
