import pt.uma.tspi.arqd.*;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void ifElse(String menu){

        if(menu.equals("START")){
            System.out.println(Menu.START);
        } else if (menu.equals("SAVEGAME")) {
            System.out.println(Menu.SAVEGAME);
        } else if (menu.equals("LOADGAME")) {
            System.out.println(Menu.LOADGAME);
        } else if (menu.equals("HIGHSCORES")) {
            System.out.println(Menu.HIGHSCORES);

        } else if (menu.equals("QUIT")) {
            System.out.println(Menu.QUIT);
        }
        else{
            System.out.println("Opção nao encontrada");
        }
    }


    public static void Switch(String menu){
        switch (menu){
            case "START":
                System.out.println(Menu.START);
                break;
            case "SAVEGAME":
                System.out.println(Menu.SAVEGAME);
                break;
            case "LOADGAME":
                System.out.println(Menu.LOADGAME);
                break;
            case "HIGHSCORES":
                System.out.println(Menu.HIGHSCORES);
                break;
            case "QUIT":
                System.out.println(Menu.QUIT);
                break;
            default:
                System.out.println("Opção não encontrada");
                break;

        }
    }


    public static void main(String[] args) {

        /*for (Menu menu: Menu.values()) {
            System.out.println(menu);
        }

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduza uma opção: ");
        String line = scanner.nextLine();
        Menu menu=Menu.valueOf(line);

        ifElse(menu.toString());
        Switch(menu.toString());

         */


        Rational r0= new Rational();
        Rational r1= new Rational(10,10);
        Rational r2= new Rational(1,2);
        Rational r3= new Rational(3,3);
        Rational r4= new Rational(2,2);

        System.out.println(r1.equals(r2));
        System.out.println(r1.compareTo(r2));

        List<Rational> rationalList= new ArrayList<Rational>();
        rationalList.add(r0);
        rationalList.add(r1);
        rationalList.add(r2);
        rationalList.add(r3);
        rationalList.add(r4);


        System.out.println(rationalList);


        Collections.sort(rationalList);

        System.out.println(rationalList);

        Student s1=new Student(1,"Pedro");
        Student s2=new Student(2,"Francisco");
        Student s3=new Student(3,"Joao");
        Student s4=new Student(4,"Martim");
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.hashCode());

        List<Student>studentList=new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("By number: ");
        Collections.sort(studentList, new StudentsComparatorByNumber());
        System.out.println(studentList);

        System.out.println("By name: ");
        Collections.sort(studentList,new StudentsComparatorByName());
        System.out.println(studentList);

        Map<String,Course> courseMap= new HashMap<String,Course>();
        Course c1= new Course(1,79,2,"Matematica");
        Course c2= new Course(2,40,3,"Desporto");
        Course c3= new Course(3,60,1,"Pesca");
        Course c4= new Course(4,50,2,"Ingles");

        courseMap.put(c1.getName(), c1);
        courseMap.put(c2.getName(), c2);
        courseMap.put(c3.getName(), c3);
        courseMap.put(c4.getName(), c4);

        System.out.println(  courseMap.containsKey("Matematica"));

        Set<String> keys= courseMap.keySet();

        for (String key:keys) {
            System.out.println(key);
        }

        Collection<Course> values = courseMap.values();

        for (Course value:values) {
            System.out.println(value);
        }

        for (String key:keys) {
            System.out.println("Key:" + key);
            System.out.println(courseMap.get(key));
        }


        SortedSet<Integer>anos = new TreeSet<>();
        for (String key:keys) {
            anos.add(courseMap.get(key).getAno());
        }

        //Collections.sort(anos);

        ArrayList<ArrayList<Course>> coursesByYear= new ArrayList<ArrayList<Course>>();
        for (int ano:anos) {
            ArrayList<Course>list= new ArrayList<Course>();
            for (Course course: courseMap.values()) {
                if(ano==course.getAno()){
                    list.add(course);
                }
            }
            coursesByYear.add(list);
        }

        for (ArrayList<Course>list:coursesByYear) {
            for (Course course:list) {
                System.out.println(course);
            }
        }









    }



}