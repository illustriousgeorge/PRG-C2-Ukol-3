import java.util.Scanner;

public class lastWord {
    public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter sentence");

            String userSentance = myObj.nextLine();
            String lastWord = userSentance.substring(userSentance.lastIndexOf("")+1);
            System.out.println("Last word is: " + lastWord);
    }
}
