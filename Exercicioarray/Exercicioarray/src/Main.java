public class Main {
    public static void main(String[] args) {

        final int[] studentNumbers={20032,30312,25342,31432};
        final String[] courseAcronyms={"AD","WEB-FE","WEB-BE"};
        final int[][]studentGrades={{15,18,17},{18,10,11},{11,13,15},{10,19,16}};

        float highestAvg=0;
        int bestStudent=0;
        for (int i = 0; i < studentNumbers.length; i++) {
            float sum=0;

            System.out.println("Aluno "+studentNumbers[i]+" obteve as seguintes avaliaçoes: ");
            for (int j = 0; j < courseAcronyms.length; j++) {
                System.out.println("\t"+courseAcronyms[j]+": " + studentGrades[i][j]);
                sum+=studentGrades[i][j];
            }
            sum/= courseAcronyms.length;

            if(sum>highestAvg){
                highestAvg=sum;
                bestStudent=studentNumbers[i];
            }

            System.out.println("\t"+"A sua média é: "+sum);
        }
        System.out.println("A média mais alta é:" + highestAvg + " do aluno: "+ bestStudent);

    }
}