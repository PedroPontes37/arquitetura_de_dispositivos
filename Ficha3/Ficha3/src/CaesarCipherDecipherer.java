public class CaesarCipherDecipherer {

   public static String chipher(String frase){
       String chipher="";
       char c;
        for (int i = 0; i < frase.length(); i++) {
            c=frase.charAt(i);
            if(c!=' '){
                chipher+=CharacterUtilities.lowerLetterSuccessorStepsOf(c,2);
            }else{
                chipher+=' ';
            }

        }
        return  chipher;
    }

    public static String decipher(String frase){
       String decipher="";
       char c;
        for (int i = 0; i < frase.length(); i++) {
            c=frase.charAt(i);
            if(c!=' '){
                decipher+=CharacterUtilities.lowerLetterPredecessorStepsOf(c,2);
            }
            else{
                decipher+=' ';
            }
        }

       return  decipher;
    }


}
