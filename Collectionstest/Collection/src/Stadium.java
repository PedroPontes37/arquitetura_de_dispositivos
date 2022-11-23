public class Stadium {
    private String name;
    private String country;
    private int capacity;


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Stadium(String name, String country, int capacity){
        this.name=name;
        this.country=country;
        this.capacity=capacity;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+": "  + this.name + " Country: " +
                this.country + " Capacity: " + this.capacity;

    }
}
