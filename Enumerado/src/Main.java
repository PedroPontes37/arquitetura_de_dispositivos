import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        ArrayList<Point> arrayList =new ArrayList<Point>();


        Point p1 = new Point();

        arrayList.add(p1);
        arrayList.add(new Point(10,10));
        arrayList.add(new Point(5,5));
        arrayList.add(new Point(13,14));


        Point element = arrayList.get(2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(new Point());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        String str= stack.pop();

        HashMap<String,Point> map = new HashMap<String, Point>();
        map.put("Point1",new Point());
        map.put("Point2",new Point(10,10));

        Point pn= map.get("Point2");

    }
}