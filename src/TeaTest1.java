// Tea class
class Tea{
    // Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }
}

// BlackTea class
class BlackTea extends Tea {
    // Method to prepare black tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves, and brewing for 5 minutes.");
    }
}

// GreenTea class
class GreenTea extends Tea {
    // Method to prepare green tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves, and brewing for 3 minutes.");
    }
}

// HerbalTea class
class HerbalTea extends Tea {
    // Method to prepare herbal tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves, and brewing for 7 minutes.");
    }
}

// Main class
public class TeaTest1 {
    public static void main(String[] args) {
        // Create an array of Tea objects
        Tea[] teas = new Tea[3];

        // Initialize each element with instances of Tea and its subclasses
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();

        // Loop through the array and prepare each tea
        for (int i = 0; i < teas.length; i++) {
            System.out.println("Preparing tea " + (i + 1) + ":");
            teas[i].prepareTea(); // Polymorphic method invocation
            System.out.println(); // Add a blank line for separation
        }
    }
}
