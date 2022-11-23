public class CharacterDrawingUtilities {
    public static void drawElement(char carater){
        System.out.print(carater);
    }

    public static void drawNewLine(){
        System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char carater,int number){
        for (int i = 0; i <number ; i++) {
            drawElement(carater);
        }
    }

    public static void drawFilledRectangleWith(char carater,int width,int height){
        for (int i = 0; i < height; i++) {
            drawHorizontalSegmentWith(carater,width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char carater,int height, int width){
        for (int i = 0; i < height; i++) {
            if (i==0||i==height-1){
                drawHorizontalSegmentWith(carater,width);
                drawNewLine();
            }
            else{
                for (int j = 0; j < width; j++) {
                    if (j==0 || j==width-1){
                        drawElement(carater);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                drawNewLine();
            }


        }
        }



}
