public class Main {
    public static void main(String[] args) {

        Point p0 = new Point(1,1);
        Point p1= new Point();
        Point p2= new Point(3,1);

        double distance =p0.distanceTo(p2);
        System.out.println(distance);

        Triangle tr = new Triangle();
        Triangle tr1 = new Triangle(p0,p1,p2);
        Triangle tr2 = new Triangle(new Point(),new Point(3,0),new Point(0,3));





        double base= tr2.base();
        double altura= tr2.altura();
        double area= tr2.area();
        System.out.println("Base:"+base);
        System.out.println("Altura:"+altura);
        System.out.println("Area:"+area);


        Rectangle r=new Rectangle(new Point(0,3),3,5);
        System.out.println("Area: "+r.area());
        System.out.println("Perimetro: "+r.perimetro());

        Point p=new Point(2,2);
        System.out.println(r.contain(p));







    }
}