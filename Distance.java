public class Main {
    public static void main(String[] args) {
        double distance = 150.0; // Example distance in kilometers
        double speed = 50.0; // Example speed in kilometers per hour
        
        double time = distance / speed;
        
        System.out.println("Time required to travel " + distance + " km at " + speed + " km/h is " + time + " hours.");
    }
}
