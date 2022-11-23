import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Vehicle c2 = new Car(2022, "BMW", "I8", 10000, "AZUL",5);


        Motorcycle c1 = new Motorcycle(2010, "BMW", "M", 10000, "Verde",2,5);



        System.out.println(c2.toString());
        c2.drive();
        System.out.println(c1.toString());
        c1.drive();

        Triangle tr= new Triangle(new Point(0,0),new Point(3,0),new Point(0,3));
        Rectangle rt=new Rectangle(new Point(0,0),100,100);
        Figure figure=new Figure();

        figure.add(tr);
        figure.add(rt);


        for (Shape shape: figure.getShapes()
             ) {
            double area= shape.area();
            double perimetro= shape.perimetro();
            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + " Perimetro: " + perimetro);

        }

        ArrayList<Point> arrayList = new ArrayList<Point>();
        arrayList.add(new Point());
        arrayList.add(new Point(10,10));
        arrayList.add(new Point(50,5));
        arrayList.add(new Point(2,3));

        System.out.println(arrayList.toString());
    //Ordenação default da lista contendo os pontos
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());

        Collections.sort(arrayList,new PointComparator());
        System.out.println(arrayList.toString());
    }
}