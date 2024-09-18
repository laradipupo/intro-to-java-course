public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    //constructor method
    public Car (String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = colour;
        this.year = year;
    }

    public String getMake() {
        return make;
    } 
    public String getModel() {
        return model;
    } 
    public int getYear() {
        return year;
    } 
    public String getColour(){
        return colour;
    } 
    public void setColour() {
        return colour;
    } 
    public String getDetails() {
        String details = String.format("The make and model of car is %s and %s. The year of the car is %s. The color of the car is %s", this.make, this.model, this.year, this.color) ;
        return details;
    } 
}