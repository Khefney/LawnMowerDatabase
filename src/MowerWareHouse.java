/*

Description: This Java program defines a class called `MowerWareHouse` which serves as a virtual storage space for various types of lawnmowers.
It allows users to add, remove, and modify mower objects, as well as read mower data from an input file.
The program also enables the display of mowers based on their types, such as lawn tractors, commercial mowers, gas-powered mowers, and push reel mowers.
 Additionally, it provides functionality to represent the contents of the warehouse as a string for easy visualization.

 */



import java.io.*;
import java.util.ArrayList;

public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;

    public MowerWareHouse() {
        this.mowers = new ArrayList<>();
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    public String getStoreName() {
        return this.storeName;
    }


    public void addMower(Mower mower) {
        this.mowers.add(mower);
    }


    public int getNumMowers() {
        return this.mowers.size();
    }


    public void removeMower(int index) {
        if (index >= 0 && index < this.mowers.size()) {
            this.mowers.remove(index);
        }
    }

    public Mower getMower(int index) {
        if (index >= 0 && index < this.mowers.size()) {
            return this.mowers.get(index);
        }
        return null;
    }

    public void setMower(int index, Mower newMower) {
        if (index >= 0 && index < this.mowers.size()) {
            this.mowers.set(index, newMower);
        }
    }
    /*
    This method reads mower data from an input file line by line.
    It parses each line to extract information such as manufacturer, year, serial number, and type of mower. Depending on the type,
    it calls specific methods to further process the data and create mower objects. Any IO exceptions encountered during
    the file reading process are caught and handled by displaying an error message.
     */
    public void readMowerData(String inputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                String manufacturer = line;
                int year = (int)Double.parseDouble(reader.readLine().trim());
                String serialNumber = reader.readLine().trim();
                String type = reader.readLine().trim();
                switch (type) {
                    case "L":
                        readLawnTractor(reader, manufacturer, year, serialNumber);
                        break;
                    case "C":
                        readCommercialMower(reader, manufacturer, year, serialNumber);
                        break;
                    case "G":
                        readGasPoweredMower(reader, manufacturer, year, serialNumber);
                        break;
                    case "P":
                        readPushReelMower(reader, manufacturer, year, serialNumber);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    /*
    This method `saveMowerData` writes the string representations of each mower in the `mowers` list to a specified output file.
    It catches and handles any IOExceptions that occur during the file writing process, providing error feedback if necessary.
     */
    public void saveMowerData(String outputFileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            for (Mower mower : mowers) {
                writer.println(mower.toString());
            }
            System.out.println("Mower data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving mower data: " + e.getMessage());
        }
    }


    /*
    These methods are designed to parse specific data types corresponding to various lawnmower models from a buffered reader.
- `readLawnTractor` processes details such as engine specifications and deck width to instantiate a `LawnTractor` object.
- `readCommercialMower` handles operating hours and zero turn radius information to create a `CommercialMower` object.
- `readGasPoweredMower` extracts cut width, wheel diameter, and self-propelled status to construct a `GasPoweredMower` object.
- `readPushReelMower` reads the number of wheels to generate a `PushReelMower` object. These methods are integral to populating a list of lawnmowers within the `MowerWareHouse` class based on input data.
     */

    private void readLawnTractor(BufferedReader reader, String manufacturer, int year, String serialNumber) throws IOException {
        String engineManufacturer = reader.readLine().trim();
        double horsePower = Double.parseDouble(reader.readLine().trim());
        int cylinders = Integer.parseInt(reader.readLine().trim());
        String model = reader.readLine().trim();
        double deckWidth = Double.parseDouble(reader.readLine().trim());

        Engine engine = new Engine(engineManufacturer, horsePower, cylinders);
        LawnTractor lawnTractor = new LawnTractor(manufacturer, year, serialNumber, engine, model, deckWidth);
        mowers.add(lawnTractor);
    }

    private void readCommercialMower(BufferedReader reader, String manufacturer, int year, String serialNumber) throws IOException {
        String model = reader.readLine().trim(); // Assuming "Poulan Parts" is the model
        double operatingHours = Double.parseDouble(reader.readLine().trim());
        boolean zeroTurnRadius = Boolean.parseBoolean(reader.readLine().trim());
        CommercialMower commercialMower = new CommercialMower(manufacturer, year, serialNumber, operatingHours, zeroTurnRadius);
        mowers.add(commercialMower);
    }



    private void readGasPoweredMower(BufferedReader reader, String manufacturer, int year, String serialNumber) throws IOException {
        double cutWidth = Double.parseDouble(reader.readLine().trim());
        double wheelDiameter = Double.parseDouble(reader.readLine().trim());
        boolean selfPropelled = Boolean.parseBoolean(reader.readLine().trim());

        GasPoweredMower gasPoweredMower = new GasPoweredMower(manufacturer, year, serialNumber, cutWidth, wheelDiameter, selfPropelled);
        mowers.add(gasPoweredMower);
    }

    private void readPushReelMower(BufferedReader reader, String manufacturer, int year, String serialNumber) throws IOException {
        int numWheels = Integer.parseInt(reader.readLine().trim());
        PushReelMower pushReelMower = new PushReelMower(manufacturer, year, serialNumber, numWheels);
        mowers.add(pushReelMower);
    }
    /*
    This method prints out mowers of a specified type from the list of mowers stored in the `MowerWareHouse`.
    It iterates through each mower in the list and checks if its type matches the provided `type` parameter,
    then prints the details of matching mowers to the console.
     */
    public void displayMowersByType(String type) {
        System.out.println("\nDisplaying " + type + " mowers:");
        for (Mower mower : mowers) {
            if ((type.equals("L") && mower instanceof LawnTractor) ||
                    (type.equals("C") && mower instanceof CommercialMower) ||
                    (type.equals("G") && mower instanceof GasPoweredMower) ||
                    (type.equals("P") && mower instanceof PushReelMower)) {
                System.out.println(mower);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(storeName);

        for (Mower mower : mowers) {
            sb.append("\n").append(mower.toString());
        }

        return sb.toString();
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
