import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int number = scan.nextInt();
       guess(number);

       scan.close();
    }
    /**
     * guess takes number and keeps letting you guess until you guess correctly
     * @param number
     */
    public static void guess(int number){
        Scanner scan = new Scanner(System.in);
        while(!(number == 3)){
            System.out.println("Guess again: ");
            number = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }

}
