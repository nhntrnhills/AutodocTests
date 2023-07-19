public class Car {
    private int numOfWheels;
    private int numOfDoors;
    private String brand;

    public Car(int numOfWheels, int numOfDoors, String brand) {
        this.numOfWheels = numOfWheels;
        this.numOfDoors = numOfDoors;
        this.brand = brand;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
