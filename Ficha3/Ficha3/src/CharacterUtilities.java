public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char letter){
        char nextLetter=letter;
        if(letter=='z'){
            nextLetter='a';
        }
        else{
            nextLetter++;
        }
        return nextLetter;
    }

    public static char lowerLetterPredecessorOf(char letter){
        char previousLetter=letter;
        if(letter=='a'){
            previousLetter='z';
        }
        else{
            previousLetter--;
        }
        return previousLetter;
    }

    public static char lowerLetterSuccessorStepsOf(char letter, int number){
        char newletter=letter;
        for (int i = 0; i < number; i++) {
            newletter=lowerLetterSuccessorOf(newletter);
        }

        return newletter;
    }

    public static char lowerLetterPredecessorStepsOf(char letter, int number){
        char newletter=letter;
        for (int i = 0; i < number; i++) {
            newletter=lowerLetterPredecessorOf(newletter);
        }

        return newletter;
    }

    public static int occurrencesOfCharacterIn(char[]letters, char letter){
        int NumberOfOccurrences=0;
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]==letter){
                NumberOfOccurrences++;
            }
        }
        return NumberOfOccurrences;
    }

    public static char[]replaceCharacterIn(char[]letters, char letter,char newLetter){
        char[]newArray= new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]==letter){
                newArray[i]=newLetter;
            }
            else{
                newArray[i]=letters[i];
            }
        }
        return newArray;
    }


    public static char[]concatenationOf(char[]array1,char[]array2){
        char[]newArray= new char[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[i+array1.length]=array2[i];
        }
        return newArray;
    }

    public static char[] copyOfPartOf(char[]array, int start,int stop){
        char[]newArray= new char[stop-start+1];
        int j=0;
        for (int i = start ; i <= stop ; i++) {
            newArray[j]+=array[i];
            j++;

        }
        return newArray;
    }
}
