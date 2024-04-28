/*
Author: Kirsten Hefney
Comp167.001
Due: March 24th 2024
Description: This Java class `CommercialMower` extends the `Mower` class, representing a commercial-grade lawnmower.
- It introduces additional properties such as operating hours, a boolean indicating zero turn radius capability, model, deck width, and an `Engine` object.
- The class provides constructors to initialize these properties, accessor/mutator methods for retrieving and modifying them, and an overridden
`toString` method to provide a string representation of a commercial mower's details, including its manufacturer, year, serial number, engine details (if available),
model, deck width, operating hours, and zero turn radius capability. If no engine is provided, it prints "No Engine" as a fallback.

 */

public class CommercialMower extends Mower {
    private double operatingHours;
    private boolean zeroTurnRadius;
    private String model;
    private double deckWidth;
    private Engine engine;
    // Default constructor initializes properties to default values
    public CommercialMower() {
        super();
        this.operatingHours = 0.0;
        this.zeroTurnRadius = false;
        this.model = "";
        this.deckWidth = 0.0;
        this.engine = null;
    }
    // Constructor with basic mower details
    public CommercialMower(String manufacturer, int year, String serialNumber, double operatingHours, boolean zeroTurnRadius) {
        super(manufacturer, year, serialNumber);
        this.operatingHours = operatingHours;
        this.zeroTurnRadius = zeroTurnRadius;
        this.model = "";
        this.deckWidth = 0.0;
        this.engine = null;
    }
    // Constructor with full details including engine
    public CommercialMower(String manufacturer, int year, String serialNumber, double operatingHours, boolean zeroTurnRadius, String model, double deckWidth, Engine engine) {
        super(manufacturer, year, serialNumber);
        this.operatingHours = operatingHours;
        this.zeroTurnRadius = zeroTurnRadius;
        this.model = model;
        this.deckWidth = deckWidth;
        this.engine = engine;
    }

    // Accessors and Mutators
    public double getOperatingHours() { return operatingHours; }
    public void setOperatingHours(double operatingHours) { this.operatingHours = operatingHours; }
    public boolean isZeroTurnRadius() { return zeroTurnRadius; }
    public void setZeroTurnRadius(boolean zeroTurnRadius) { this.zeroTurnRadius = zeroTurnRadius; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getDeckWidth() { return deckWidth; }
    public void setDeckWidth(double deckWidth) { this.deckWidth = deckWidth; }
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }

    // Method to represent mower details as a string

    @Override
    public String toString() {
        return getManufacturer() + "\n" +
                getYear() + "\n" +
                getSerialNumber() + "\n" +
                "C\n" +
                (engine != null ? engine.getManufacturer() + "\n" + engine.getHoursePower() + "\n" + engine.getCylinders() : "No Engine\n0\n0") + "\n" + // Engine details, "No Engine" as fallback
                model + "\n" +
                deckWidth + "\n" +
                operatingHours + "\n" +
                zeroTurnRadius;
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
