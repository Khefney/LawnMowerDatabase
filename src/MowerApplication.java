/*
Author: Kirsten Hefney
Comp167.001
Due: March 24th 2024
Description:This Java program, `MowerApplication`, serves as an interface for managing lawnmower data stored in an input file.
- It allows users to either specify an input file as a command-line argument or select one using a GUI file chooser.
- After reading mower data from the input file, it prompts the user to choose a type of lawnmower (commercial, gas-powered, push reel, or lawn tractor)
and displays information about mowers of that type until the user chooses to stop the program.

 */



import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class MowerApplication {
    public static void main(String[] args) {
        String inputFileName = null;
        // Check if command-line arguments are provided. If not, prompt the user to select an input file using a file chooser dialog.
        // If the user selects a file, retrieve its absolute path and assign it to the inputFileName variable.

        if (args.length > 0) {
            inputFileName = args[0];
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select an Input File");
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                inputFileName = selectedFile.getAbsolutePath();
            }
        }

        // Proceed if an input file name has been determined


        // Create a new instance of MowerWareHouse to manage mower data and read mower data from the input file.
        if (inputFileName != null) {
            MowerWareHouse wareHouse = new MowerWareHouse();
            wareHouse.readMowerData(inputFileName);
            // Proceed with the program execution if an input file name has been determined.
            Scanner scanner = new Scanner(System.in); // Prompt the user to select a type of mower and display information accordingly until the user chooses to stop.
            String choice = "";
            while (!"S".equals(choice)) {
                System.out.println("\nEnter your choice of Mower to get information.");
                System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push Reel Mower, L for Lawn Tractor, and S to stop");
                choice = scanner.nextLine().toUpperCase();

                switch (choice) {
                    case "C":
                        wareHouse.displayMowersByType(choice);
                        break;
                    case "G":
                        wareHouse.displayMowersByType(choice);
                        break;
                    case "P":
                        wareHouse.displayMowersByType(choice);
                        break;
                    case "L":
                        wareHouse.displayMowersByType(choice);
                        break;
                    case "S":
                        System.out.println("Stopping the program.");
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                }
            }
            scanner.close(); // Close the scanner used for user input after the loop ends. If no input file is specified, inform the user accordingly.
        } else {
            System.out.println("No input file specified.");
        }
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
