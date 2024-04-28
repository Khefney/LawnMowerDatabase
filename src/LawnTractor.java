/*
Author: Kirsten Hefney
Comp167.001
Due: March 24th 2024
Description: This Java class `LawnTractor` represents a specific type of lawnmower, extending the `Mower` class.
- It introduces additional properties such as an `Engine`, model, and deck width to capture specific features of lawn tractors.
- The class provides constructors to initialize these properties and accessor/mutator methods for retrieving and modifying them,
along with an overridden `toString` method to provide a string representation of a lawn tractor's details.

 */



public class LawnTractor extends Mower {
    private Engine engine;
    private String model;
    private double deckWidth;
    //Default constructor
    public LawnTractor() {}
    //OVERLOADED constructor pulling other attributes from Mower
    public LawnTractor(String manufacturer, int year, String serialNumber, Engine engine, String model, double deckWidth) {
        super(manufacturer, year, serialNumber);
        this.engine = engine;
        this.model = model;
        this.deckWidth = deckWidth;
    }

    // Accessors and Mutators
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getDeckWidth() { return deckWidth; }
    public void setDeckWidth(double deckWidth) { this.deckWidth = deckWidth; }

    @Override
    public String toString() {
        return getManufacturer() + "\n" +
                getYear() + "\n" +
                getSerialNumber() + "\n" +
                " L\n" +
                engine.getManufacturer() + "\n" +
                engine.getHoursePower() + "\n" +
                engine.getCylinders() + "\n" +
                model + "\n" +
                deckWidth;
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
