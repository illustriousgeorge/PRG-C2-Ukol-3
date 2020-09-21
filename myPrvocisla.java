import java.util.Scanner;

public class myPrvocisla {

    public static void main(String args[]){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        String userNumber = myObj.nextLine();
        int foo = Integer.parseInt(userNumber);
        int number = 2;
        int count = 0;
        while(count < foo){


            if(isPrimeNumber(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    private static boolean isPrimeNumber(int number){
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
