public class Main {
    public static void main(String[] args) {

        float powerOf = NumericalUtilities.powerOf(2,3);
        System.out.println(powerOf);

        int sumOfNaturalNumbersUpTo= NumericalUtilities.sumOfNaturalNumbersUpTo(10);
        System.out.println(sumOfNaturalNumbersUpTo);

        int sumOfNaturalNumbersBetween= NumericalUtilities.sumOfNaturalNumbersBetween(2,5);
        System.out.println(sumOfNaturalNumbersBetween);

        int sumOfEvenNumbersBetween= NumericalUtilities.sumOfEvenNumbersBetween(0,10);
        System.out.println(sumOfEvenNumbersBetween);

        int numberOfDivisorsOf= NumericalUtilities.numberOfDivisorsOf(5);
        System.out.println(numberOfDivisorsOf);

        boolean isprime = NumericalUtilities.isprime(4);
        System.out.println(isprime);

        int[]array={1,3,5,6};

        String toString = ArrayUtilities.toString(array);
        System.out.println(toString);

        int maximumOf = ArrayUtilities.maximumOf(array);
        System.out.println(maximumOf);

        int minimumOf = ArrayUtilities.minimumOf(array);
        System.out.println(minimumOf);

        int[] copyOf= ArrayUtilities.copyOf(array);
        System.out.println(ArrayUtilities.toString(copyOf));

        boolean contains = ArrayUtilities.contains(array,3);
        System.out.println(contains);

        boolean containsDuplicates = ArrayUtilities.containsDuplicates(array);
        System.out.println(containsDuplicates);

        int indexof= ArrayUtilities.indexof(array,5);
        System.out.println(indexof);

        int[] add = ArrayUtilities.add(array,37);
        System.out.println(ArrayUtilities.toString(add));

        int[] remove = ArrayUtilities.remove(array,5);
        System.out.println(ArrayUtilities.toString(remove));

    }
}