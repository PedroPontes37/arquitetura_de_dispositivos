package pt.uma.tspi.arqd;

import java.util.Objects;
import java.util.concurrent.DelayQueue;

public class Rational implements Comparable<Rational>{

    private int numerator,denominator;

    public Rational(){
        numerator=0;
        denominator=0;
    }

    public Rational(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }


    @Override
    public boolean equals(Object obj) {
        Rational other= (Rational) obj; //cast
        return this.numerator== other.numerator && this.denominator==other.denominator;
    }

    @Override
    public int compareTo(Rational o) {
        int numeDiff=this.numerator-o.numerator;
        int denoDiff=this.denominator-o.denominator;
        return numeDiff+denoDiff;

    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator,denominator);
    }

    @Override
    public String toString() {
        return "Numerator: " + this.numerator + " Denominator: " + this.denominator;
    }
}
