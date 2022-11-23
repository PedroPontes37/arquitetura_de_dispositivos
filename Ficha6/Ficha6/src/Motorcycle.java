public class Motorcycle extends Vehicle {

    private int wheels;
    private int velocity;


    public Motorcycle() {

        this.wheels = 0;
        this.velocity = 0;
    }

    public Motorcycle( int year, String brand, String model, float price, String color, int wheels, int velocity) {
        super(year, brand, model, price, color);
        this.wheels = wheels;
        this.velocity = velocity;
    }


    @Override
    public String toString() {
        return super.toString() + "wheels : " + this.wheels + " Velocidades : " + this.velocity;
    }

    @Override
    public void drive() {
        System.out.println("A conduzir Mota");
    }
}