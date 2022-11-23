public class Main {

    public static void HW() {
        System.out.println("Hello world!");
    }

    public static float Perimetro(float width, float heigth)
    {
        float p=(width*2)+(heigth*2);
        return  p;
    }

    public static float Volume(float width, float heigth, float depth)
    {
        float v=width*heigth*depth;
        return  v;
    }

    public static float Temperature(float farenheit){
        float c= (farenheit-32)* 5/9;
        return c;
    }

    public static float Time (float hour, float min, float seconds){
        float HourToSecond = hour*3600;
        float Mintosecond= min*60;
        float TotalSeconds= HourToSecond+Mintosecond+seconds;
        return(TotalSeconds);
    }


    public static int Maximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length ; i++){
            if(max < array[i]){
                max=array[i];
            }
        }
        return max;

    }

    public static int smaller(int[] array) {
        int small = array[0];
        for (int i = 1; i < array.length ; i++){
            if(small > array[i]){
                small=array[i];
            }
        }
        return small;

    }

    public static float average(int[] array) {
        float total = 0;
        float average;
        for (int i = 0; i < array.length ; i++){
            total+=array[i];
        }
        average=total/(array.length);
        return average;

    }


    public static void main(String[] arguments){
        HW();
        float p = Perimetro(4,2);
        //String str= String.format("Perimetro do comprimento do retangulo: {}" 3);
        System.out.println(p);
       // System.out.println(str);

        float v = Volume(3,3,3);
        System.out.println(v);

        float t= Temperature(50);
        System.out.println(t);

        float s = Time(1,5,20);
        System.out.println(s);

        int[] array ={ 7,2,3,0,1};
        int max = Maximum(array);
        System.out.println(max);

        int small= smaller(array);
        System.out.println(small);

        float ave= average(array);
        System.out.println(ave);

    }

}

