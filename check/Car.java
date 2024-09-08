public class Car {
    // Attributes
    private String model;
    private int year;
    private String color;

    // Constructor
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }

    // Main method to create and display car objects
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Toyota Camry", 2020, "Red");
        Car car2 = new Car("Honda Accord", 2018, "Blue");

        // Displaying car information
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}

