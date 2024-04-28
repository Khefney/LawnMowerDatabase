/*
Description: This Java program defines an abstract class named `Mower`, representing a generic lawnmower.
- It encapsulates basic properties such as manufacturer, manufacturing year, and serial number.
- The class provides constructors for initializing these properties and accessor/mutator methods for retrieving and modifying them.
- Additionally, it overrides the `toString` method to provide a string representation of the mower's details, separated by newline characters.

 */



public abstract class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;

    // Default constructor
    public Mower() {}
    // Parameterized constructor to initialize manufacturer, year, and serial number
    public Mower(String manufacturer, int year, String serialNumber) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    // Accessors and Mutators
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    @Override
    public String toString() {
        return manufacturer + "\n" + year + "\n" + serialNumber + "\n#";
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
