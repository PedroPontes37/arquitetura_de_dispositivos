public class Team {
    private String name;
    private int number;
    private int rank;

    private Stadium stadium;

    public Team(String name,int number, int rank,Stadium stadium){
        this.name  =name;
        this.number=number;
        this.rank=rank;
        this.stadium=stadium;
    }

    public Stadium getStadium() {
        return stadium;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+": " +
                this.name + " Number: " + this.number + ", Rank: " + this.rank + " "+ stadium.toString();

    }
}
