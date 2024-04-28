/*
Author: Kirsten Hefney
Comp167.001
Due: March 24th 2024
Description: This code defines an abstract class `WalkBehindMower` which extends another class `Mower`.
It represents walk-behind mowers and includes attributes such as cutting width and wheel diameter.
It provides constructors to initialize these properties and overrides the `toString` method to return a string representation of the mower,
including manufacturer, year, serial number, cut width, and wheel diameter.
 */




public abstract class WalkBehindMower extends Mower {
    private double cutWidth;
    public double wheelDiameter;

    // Default constructor
    public WalkBehindMower() {}
    // Parameterized or OVERLOADED constructor :D
    public WalkBehindMower(String manufacturer, int year, String serialNumber, double cutWidth, double wheelDiameter) {
        super(manufacturer, year, serialNumber);
        this.cutWidth = cutWidth;
        this.wheelDiameter = wheelDiameter;
    }

    // Accessors (getters) and Mutators (setters) for private member variables
    public double getCutWidth() { return cutWidth; }
    public void setCutWidth(double cutWidth) { this.cutWidth = cutWidth; }
    public double getWheelDiameter() { return wheelDiameter; }
    public void setWheelDiameter(double wheelDiameter) { this.wheelDiameter = wheelDiameter; }

    @Override
    public String toString() {
        return getManufacturer() + "\n" +
                getYear() + "\n" +
                getSerialNumber() + "\n" +
                "#\n" +
                cutWidth + "\n" +
                wheelDiameter;
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
