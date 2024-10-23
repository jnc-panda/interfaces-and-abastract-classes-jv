public class Sky extends Environment<Flyable> {

    @Override
    public void checkTraffic() {
        // Logic for checking air traffic
        System.out.println("Checking air traffic for flyable objects.");
        for (Flyable flyable : traffic) {
            System.out.println("Flyable object: " + flyable);
            flyable.fly(); // Calls the fly method from the Flyable interface.
        }
    }
}
