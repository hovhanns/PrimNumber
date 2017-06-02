import java.util.Scanner;

public class Prob1x9x {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        char[] cWord = word.toCharArray();
        char [] myWord = new char[cWord.length];
        for (int i = 0; i < cWord.length; i++ ){
            myWord[i] = word.charAt(i);
        }

        char [] changedWord = new char[cWord.length];
        int j = 0;
        for (int i = cWord.length; i >= 0; i--){
            changedWord[j] = cWord[j];
            j = j +1;
            if (j > cWord.length){
                break;
            }
        }

    }
}
