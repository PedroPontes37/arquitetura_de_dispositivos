public class Main {
    public static void main(String[] args) {
        char letter='a';
        char letterdois='b';
        int start=1;
        int stop=3;
        char[]letters={'a','b','c','d','e'};
        char[]letters2={'c','d','c'};
        char newLetter='p';

        char lowerLetterSuccessorOf= CharacterUtilities.lowerLetterSuccessorOf(letter);
        System.out.println(lowerLetterSuccessorOf);

        char lowerLetterPredecessorOf=CharacterUtilities.lowerLetterPredecessorOf(letter);
        System.out.println(lowerLetterPredecessorOf);

        char lowerLetterSuccessorStepsOf=CharacterUtilities.lowerLetterSuccessorStepsOf(letter,3);
        System.out.println(lowerLetterSuccessorStepsOf);

        char lowerLetterPredecessorStepsOf= CharacterUtilities.lowerLetterPredecessorStepsOf(letterdois,2);
        System.out.println(lowerLetterPredecessorStepsOf);


        int occurrencesOfCharacterIn=CharacterUtilities.occurrencesOfCharacterIn(letters,letter);
        System.out.println(occurrencesOfCharacterIn);

        char[] replaceCharacterIn= CharacterUtilities.replaceCharacterIn(letters,letter,newLetter);
        System.out.println(replaceCharacterIn);

        char[] concatenationOf=CharacterUtilities.concatenationOf(letters,letters2);
        System.out.println(concatenationOf);

        char[] copyOfPartOf= CharacterUtilities.copyOfPartOf(letters,start, stop);
        System.out.println(copyOfPartOf);

        String msg= "xyz";

        String chipher= CaesarCipherDecipherer.chipher(msg);
        System.out.println(chipher);

        String decipher = CaesarCipherDecipherer.decipher(chipher);
        System.out.println(decipher);


    }
}