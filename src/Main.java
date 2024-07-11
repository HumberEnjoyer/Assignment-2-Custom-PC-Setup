import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] componentTypes = {"CPU", "GPU", "RAM", "Storage"};
         //create a PCSetup object
        PCSetup pcSetup = new PCSetup(
            getInput(scanner, "Enter case size (small, medium, large): "),
            Boolean.parseBoolean(getInput(scanner, "Include RGB lighting (true/false): ")),
            Boolean.parseBoolean(getInput(scanner, "Include liquid cooling (true/false): "))
        );
        //loop through each component type to get user input and add components to PC setup
        for (String type : componentTypes) {
            pcSetup.addComponent(new PCComponent(
                type,
                getInput(scanner, "Enter " + type + " name: "),
                Double.parseDouble(getInput(scanner, "Enter " + type + " price: "))
            ));
        }
        //display the selected components and the total cost of PC setup
        System.out.println("\nSelected Components:");
        pcSetup.displayComponents();
        System.out.println("Total Cost: $" + pcSetup.calculateTotalCost());
    }

    private static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
