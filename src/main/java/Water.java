public class Water extends Environment<Swimmable> {

    @Override
    public void checkTraffic() {
        // Logic for checking water traffic
        System.out.println("Checking water traffic for swimmable objects.");
        for (Swimmable swimmable : traffic) {
            System.out.println("Swimmable object: " + swimmable);
            swimmable.swim(); // Calls the swim method from the Swimmable interface.
        }
    }
}
