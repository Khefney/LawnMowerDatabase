# Lawn Mower Database

## Overview

This Java project implements a lawn mower database system, allowing users to manage and retrieve information about different types of lawnmowers. The project includes classes to represent various types of mowers, such as `CommercialMower`, `ResidentialMower`, `RidingMower`, `GasPoweredMower`, `LawnTractor`, `PushReelMower`, `WalkBehindMower`, and an abstract class `Mower` to encapsulate common properties.

## MowerApplication Class

The `MowerApplication` class serves as an interface for managing lawnmower data stored in an input file. It allows users to either specify an input file as a command-line argument or select one using a GUI file chooser. After reading mower data from the input file, it prompts the user to choose a type of lawnmower (commercial, gas-powered, push reel, lawn tractor, etc.) and displays information about mowers of that type until the user chooses to stop the program.

## MowerWareHouse Class

The `MowerWareHouse` class serves as a virtual storage space for various types of lawnmowers. It provides functionality to add, remove, and modify mower objects, as well as read mower data from an input file. Additionally, the class enables the display of mowers based on their types, such as lawn tractors, commercial mowers, gas-powered mowers, and push reel mowers.

## Mower Classes

### CommercialMower Class

The `CommercialMower` class extends the `Mower` class and represents a commercial-grade lawnmower. It introduces additional properties such as operating hours, zero turn radius capability, model, deck width, and an `Engine` object.

### GasPoweredMower Class

The `GasPoweredMower` class extends the `WalkBehindMower` class and represents a gas-powered walk-behind mower. It introduces additional properties such as an `Engine` and a boolean indicating whether it's self-propelled.

### LawnTractor Class

The `LawnTractor` class represents a specific type of lawnmower, extending the `Mower` class. It introduces additional properties such as an `Engine`, model, and deck width to capture specific features of lawn tractors.

### PushReelMower Class

The `PushReelMower` class extends the `WalkBehindMower` class and represents a specific type of walk-behind mower. It introduces an additional property, `numWheels`, to capture the number of wheels the mower has.

### WalkBehindMower Class

The `WalkBehindMower` class is an abstract class that represents walk-behind mowers. It extends another class `Mower` and includes attributes such as cutting width and wheel diameter.

### Mower Class

The `Mower` class is an abstract class that encapsulates basic properties such as manufacturer, manufacturing year, and serial number. It provides constructors for initializing these properties and accessor/mutator methods for retrieving and modifying them.

---

## License

This project is licensed under the terms of the MIT license. See the [LICENSE](LICENSE) file for details.

Feel free to adjust or expand upon it as needed! If you have any questions or need further assistance, don't hesitate to ask.
