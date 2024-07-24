// Superclass HillStations
class HillStations {
    public void location() {
        System.out.println("Hill Stations are located in various parts of India.");
    }

    public void famousFor() {
        System.out.println("Hill Stations are famous for their natural beauty and scenic views.");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in the state of Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snow-capped mountains, scenic valleys, and adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in the state of Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its picturesque views, waterfalls, and trekking trails.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in the state of Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its snow-covered slopes, skiing, and scenic gondola rides.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of each subclass
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        // Call location() and famousFor() methods using the superclass reference
        HillStations hillStation = manali;
        hillStation.location();
        hillStation.famousFor();

        hillStation = mussoorie;
        hillStation.location();
        hillStation.famousFor();

        hillStation = gulmarg;
        hillStation.location();
        hillStation.famousFor();

        // Call location() and famousFor() methods using the subclass references
        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}