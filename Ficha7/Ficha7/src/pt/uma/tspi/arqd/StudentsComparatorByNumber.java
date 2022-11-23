package pt.uma.tspi.arqd;

import java.util.Comparator;

public class StudentsComparatorByNumber implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        return  o1.getNumber()- o2.getNumber();

    }
}
