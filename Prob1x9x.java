import java.util.Scanner;

public class Prob1x9x {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        for (int i = word.length() - 1; i>=0 ;i-- ) 
        {
            System.out.print(word.charAt(i));
        }
    }
}
