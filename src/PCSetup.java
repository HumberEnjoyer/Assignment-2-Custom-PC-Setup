import java.util.ArrayList;

public class PCSetup {
    private ArrayList<PCComponent> components;
    private String caseSize;
    private boolean rgbLighting;
    private boolean liquidCooling;
    //constructor to initialize PCSetup with case size and additional features
    public PCSetup(String caseSize, boolean rgbLighting, boolean liquidCooling) {
        this.components = new ArrayList<>();
        this.caseSize = caseSize;
        this.rgbLighting = rgbLighting;
        this.liquidCooling = liquidCooling;
    }
    //method to add a component to PC setup
    public void addComponent(PCComponent component) {
        components.add(component);
    }
    //method to calculate total cost of the PC setup
    public double calculateTotalCost() {
        double totalCost = components.stream().mapToDouble(PCComponent::getPrice).sum();

        //adding case size premium
        switch (caseSize.toLowerCase()) {
            case "small":
                totalCost += 30;
                break;
            case "medium":
                totalCost += 50;
                break;
            case "large":
                totalCost += 70;
                break;
            default:
                break;
        }

        //adding additional feature costs
        if (rgbLighting) {
            totalCost += 20;
        }
        if (liquidCooling) {
            totalCost += 100;
        }

        return totalCost;
    }
    //method to display components of the PC setup
    public void displayComponents() {
        components.forEach(component -> 
            System.out.println(component.getType() + " - " + component.getName() + ": $" + component.getPrice())
        );
    }
}
