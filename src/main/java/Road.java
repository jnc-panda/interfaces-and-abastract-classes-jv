public class Road extends Environment<Vehicle> {

    @Override
    public void checkTraffic() {
        // Logic for checking road traffic
        System.out.println("Checking road traffic for vehicles.");
        for (Vehicle vehicle : traffic) {
            System.out.println("Vehicle on the road: " + vehicle);
            vehicle.move(); // Assuming Vehicle class has a drive method.
        }
    }
}
