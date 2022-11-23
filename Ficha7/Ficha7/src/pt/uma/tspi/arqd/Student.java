package pt.uma.tspi.arqd;

import java.util.Objects;

public class Student  implements Comparable<Student> {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number=number;
        this.name=name;
    }

    public Student() {
        this.number=0;
        this.name="";
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student)  (obj);
        return this.number==other.number;
    }

    @Override
    public int compareTo(Student o) {

        return this.number-o.number;

    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return         "Numero: " + this.number + " Nome: " + this.name;

    }
}
