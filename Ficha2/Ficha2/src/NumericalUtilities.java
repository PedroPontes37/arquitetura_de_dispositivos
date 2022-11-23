public class NumericalUtilities {
    public static float powerOf (float base, float exponent){
        float result = 1;
        for (int i = 0; i < exponent; i++) {
            result*=base;
        }
        return result;
    }

    public static int sumOfNaturalNumbersUpTo (int stop ){
        int sum=0;
        for (int i = 0; i <= stop; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int sumOfNaturalNumbersBetween ( int start, int stop){
        int sum =0;
        for (int i = start; i <= stop ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int sumOfEvenNumbersBetween ( int start, int stop){
        int sum =0;
        for (int i = start; i <=stop ; i++) {
            if( i%2 == 0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int numberOfDivisorsOf ( int number){
        int numberOfDivisors=0;
        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }

    public static boolean isprime (int number){
        boolean prime = false;
        int numberOfDivisors = numberOfDivisorsOf(number);
        if(numberOfDivisors == 2){
             prime = true;
        }

        return prime;

    }
}
