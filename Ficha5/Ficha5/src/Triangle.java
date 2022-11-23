public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a=new Point();
        this.b=new Point();
        this.c=new Point();

    }

    public Triangle(Point a,Point b,Point c){
        this.a= a;
        this.b= b;
        this.c= c;

    }

    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {

        return this.c;
    }

    public void setA(Point a) {

        this.a = a;
    }

    public void setB(Point b) {

        this.b = b;
    }

    public void setC(Point c) {

        this.c = c;
    }

    public void setABC(Point a,Point b,Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double base(){
        return (a.distanceTo(b));
    }

    public double altura(){
        return (a.distanceTo(c));
    }

    public double area(){
        return (base()*altura()/2);
    }



}
