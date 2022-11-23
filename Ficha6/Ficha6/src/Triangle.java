public class Triangle extends Shape{

    private Point b;
    private Point c;

    public Triangle(){
        position=new Point();
        this.b=new Point();
        this.c=new Point();

    }



    public Triangle(Point a,Point b,Point c){
        position= a;
        this.b= b;
        this.c= c;

    }

    public Point getA() {
        return position;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {

        return this.c;
    }

    public void setA(Point a) {

        position = a;
    }

    public void setB(Point b) {

        this.b = b;
    }

    public void setC(Point c) {

        this.c = c;
    }

    public void setABC(Point a,Point b,Point c){
        position=a;
        this.b=b;
        this.c=c;
    }

    public double base(){
        return (position.distanceTo(b));
    }

    public double altura(){
        return (position.distanceTo(c));
    }


    @Override
    public double perimetro() {
        double width= this.base();
        double height= this.altura();
        double hipo= c.distanceTo(b);
        double perimeter = width +height + hipo;
        return perimeter;
    }

    @Override
    public double area() {

        return (base()*altura()/2);


    }

    @Override
    public String toString(){
        return getClass().getName()+" A: "+ this.position.toString() + "B: " +this.b.toString() +" C:" + this.c.toString();
    }



}

