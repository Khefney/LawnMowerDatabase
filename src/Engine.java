/*
Author: Kirsten Hefney
Comp167.001
Due: March 24th 2024
Description: This program defines a Java class `Engine` that models the characteristics of an engine, including its manufacturer, horsepower, and number of cylinders.
It provides a constructor for initializing these properties and includes getter and setter methods for each property to allow for their modification and retrieval.
The `toString` method is overridden to return a string representation of the engine, displaying its manufacturer, horsepower, and cylinder count, each on a new line.
*/

// Define the Engine class
public class Engine {
    // Private member variables to store engine details
    private String manufacturer;
    private double hoursePower;
    private int cylinders;

    // Default constructor
    public Engine() {}

    // Parameterized constructor
    public Engine(String manufacturer, double horsePower, int cylinders) {
        this.manufacturer = manufacturer;
        this.hoursePower = horsePower;
        this.cylinders = cylinders;
    }

    // Accessors (getters) and Mutators (setters) for private member variables

    public String getManufacturer() { return manufacturer; }

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public double getHoursePower() { return hoursePower; }

    public void setHoursePower(double horsePower) { this.hoursePower = horsePower; }

    public int getCylinders() { return cylinders; }


    public void setCylinders(int cylinders) { this.cylinders = cylinders; }

    // Provide a string representation of the Engine object
    @Override
    public String toString() {
        return manufacturer + "\n" + hoursePower + "\n" + cylinders;
    }
}
//       /\
//      /  \
//     / /\ \
//    / /__\_\
//   /_/____\_\
//   \ \    / /
//    \ \  / /
//     \ \/ /
//      \  /
//       \/
// Code zapped with creativity by [Kirsten Hefney]
