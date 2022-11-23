public class Point {

    /*atributos*/
    private double x;
    private double y;

    /**
     * Construtor por omissao
     */
    public Point(){
        x=0.0;
        y=0.0;
    }

    /*Construtor por parametros*/
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }


    /*seletor*/
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    /*modificador*/
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }

    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distanceTo(Point other) {
        double distance=0;
        distance=Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y,2));
        return distance;
    }

    @Override
    public String toString(){
        return getClass().getName() + " Point { x: " + x + " y: " + y + " }";
    }

    @Override
    public boolean equals(Object o) {
        //cast
        Point other = (Point) o;
        if(this.x == other.x && this.y== other.y){
            return true;
        }
        else {
            return false;
        }
    }
}

