public class PCComponent {
    private String type;
    private String name;
    private double price;
     //constructor to initialize the PCComponent
    public PCComponent(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    //type of the component
    public String getType() {
        return type;
    }
    //name of the component
    public String getName() {
        return name;
    }
    //price of the component
    public double getPrice() {
        return price;
    }
}
