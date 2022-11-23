public abstract class Vehicle {
    private int year;
    private String brand, model, color;

    private float price;


    public Vehicle() {
        this.year = 0;
        this.brand = "";
        this.price = 0.0f;
        this.color = "";
    }

    public Vehicle(int year, String brand, String model, float price, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year + ", Price : " + this.price + ", Color:" + this.color;
    }


    public abstract void drive();
}
