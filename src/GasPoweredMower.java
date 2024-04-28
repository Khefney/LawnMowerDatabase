/*
Description: This Java class `GasPoweredMower` extends the `WalkBehindMower` class, representing a gas-powered walk-behind mower.
- It introduces additional properties such as an `Engine` and a boolean indicating whether it's self-propelled.
- The class provides constructors to initialize these properties, accessor/mutator methods for retrieving and modifying them, and an overridden
`toString` method to provide a string representation of a gas-powered mower's details, including its manufacturer, year, serial number, cutting width, wheel diameter,
 engine details, and self-propelled status.
 */



public class GasPoweredMower extends WalkBehindMower {
    private Engine engine;
    private boolean selfPropelled;

    public GasPoweredMower() {}
    //OVERLOADED constructor with parameters and using super from WalkBehindMower as it inherits thos attributes
    public GasPoweredMower(String manufacturer, int year, String serialNumber, double cutWidth, double wheelDiameter, boolean selfPropelled) {
        super(manufacturer, year, serialNumber, cutWidth, wheelDiameter);
        this.engine = engine;
        this.selfPropelled = selfPropelled;
    }

    //Accesor getter ad setter methods
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public boolean isSelfPropelled() { return selfPropelled; }
    public void setSelfPropelled(boolean selfPropelled) { this.selfPropelled = selfPropelled; }

    @Override
    public String toString() {
        return getManufacturer() + "\n" +
                getYear() + "\n" +
                getSerialNumber() + "\n" +
                "G\n" +
                getCutWidth() + "\n" +
                getWheelDiameter() + "\n" +
                engine.getManufacturer() + "\n" +
                engine.getHoursePower() + "\n" +
                engine.getCylinders() + "\n" +
                selfPropelled;
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
