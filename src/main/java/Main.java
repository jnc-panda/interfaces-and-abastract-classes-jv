import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        List<Environment<?>> environments = List.of(sky, water);

        for (Environment<?> environment: environments) {
            environment.checkTraffic();
        }

        /*
        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

        for (Object object : objects) {

            if (object instanceof Swimmable swimmable) {
                swimmable.swim();
            }

            if (object instanceof Flyable flyable) {
                flyable.fly(); // Airplane flies second time
            }

            if (object instanceof Vehicle vehicle) {
                vehicle.move();
            }
         */



    }
}