public class ArrayUtilities {

    public static String toString(int[] array) {
        String numbers = "[ ";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                numbers += array[i] + ",";
            } else {
                numbers += array[i];
            }
        }
        numbers += " ]";
        return numbers;
    }

    public static int maximumOf(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minimumOf(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean contains(int[] array, int number) {
        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public static boolean containsDuplicates(int[] array){
        boolean exists=false;
        for (int i = 0; i < array.length; i++) {
            int sum=0;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j]){
                    sum++;
                    if(sum==2){
                        exists=true;
                        break;
                    }
                }
            }
            
        }
        return exists;
    }

    public static int indexof(int[]array, int  number){
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                index=i;
            }
        }

        return index;
    }

    public static int[] add (int[]array, int number){
        int [] newArray = new int [array.length+1];

            for (int i = 0; i < array.length+1; i++) {
                if(i< array.length){
                    newArray[i]=array[i];
                }
                else{
                    newArray[i]=number;
                }
            }
        return newArray;
    }

    public static int[] remove(int[] array, int number){
        int[]newArray= new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=number){
                newArray[i]=array[i];
            }

        }
        return  newArray;
    }


}
