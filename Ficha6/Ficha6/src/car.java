public class Car extends Vehicle {
    private int doors;


    public Car() {
        super();
        this.doors = 0;
    }

    public Car(int year, String brand, String model, float price, String color , int doors) {
        super(year, brand, model, price, color);
        this.doors = doors;
    }

    // Efetue a sobreposição do método
    @Override
    public String toString() {
        return super.toString() + " Doors  : " + this.doors;
    }

    @Override
    public void drive() {
        System.out.println("A conduzir carro");
    }
}