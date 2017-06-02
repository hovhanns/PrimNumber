import java.util.Scanner;

public class Prob1x9x {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.nextLine();


        char[] cWord = word.toCharArray();
        for (int i = cWord.length - 1; i >= 0; i--){
            System.out.print(cWord[i]);
        }
    }
}
