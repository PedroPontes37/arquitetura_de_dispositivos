public class Main {
    public static void main(String[] args) {
        int[][]matrix= {{1,0,0},{0,1,0},{0,0,1}};
        int[][]matrix2= {{1,0,0},{0,1,0},{0,0,1}};
        MatrixUtilities.show(matrix);

        boolean isMatrix=MatrixUtilities.isMatrix(matrix);
        System.out.println(isMatrix);

        boolean isIdentity=MatrixUtilities.isIdentity(matrix);
        System.out.println(isIdentity);

        int[][]multiplyBy=MatrixUtilities.multiplyBy(matrix,2);
        MatrixUtilities.show(multiplyBy);
      //  MatrixUtilities.multiplyBy(matrix,2);

        boolean areCompatibleForSum= MatrixUtilities.areCompatibleForSum(matrix,matrix2);
        System.out.println(areCompatibleForSum);

        int[][]sumOf=MatrixUtilities.sumOf(matrix,matrix2);
        MatrixUtilities.show(sumOf);

        char carater='*';

        CharacterDrawingUtilities.drawElement(carater);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith(carater,10);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawFilledRectangleWith(carater,5,5);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawEmptyRectangleWith(carater,10,10);
    }
}