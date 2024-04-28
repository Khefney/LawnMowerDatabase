/*
Description: This Java file defines a class named `PushReelMower` that extends the `WalkBehindMower` class, indicating it is a specific type of walk-behind mower.
It introduces an additional property, `numWheels`, to capture the number of wheels the mower has,
along with a constructor to initialize the mower's properties and methods to get and set the number of wheels.
The `toString` method is overridden to provide a string representation of the mower's details, including its manufacturer,
year, serial number, cutting width, wheel diameter, and the number of wheels.
 */


public class PushReelMower extends WalkBehindMower {
    private int numWheels;

    public PushReelMower() {
    }

    /*
    in this overloaded constructor we are using a super because PushWheel extends from walkbehindMower so we are pulling attrtibtes.
     */
    public PushReelMower(String manufacturer, int year, String serialNumber, double cutWidth) {
        super(manufacturer, year, serialNumber, cutWidth, 0.0);
    }

    //getter and setter methods for num wheels
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    //Overrid toString method to provide details of the mower
    @Override
    public String toString() {
        return getManufacturer() + "\n" +
                getYear() + "\n" +
                getSerialNumber() + "\n" +
                "P\n" +
                getCutWidth() + "\n" +
                getWheelDiameter() + "\n" +
                numWheels;
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

