import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int min=0;
        int max=100;
        guessGame(min, max);
        in.close();
    }

    public static void guessGame(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let me think of a number between " + min + " and " + max);
        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Choose level of dificulty-- type 'Easy' or 'Hard' : ");
        String lChoose = sc.next();
        switch (lChoose) {
            case "Easy":
                int e_att = 10;
                easyAttempts(e_att, number);
                break;
            case "Hard":
                int h_att = 5;
                hardAttempts(h_att, number);
                break;
            default:
                System.out.println("You choose a wrong option!");
                break;
        }
        System.out.println("THANK YOU!");
        sc.close();
    }

    public static void hardAttempts(int attempts, int number) {
        System.out.println("You have " + attempts + " attempts remaining to guess the number");
        while (attempts > 0) {
            if (check_guess(number) == true) {
                System.out.println("Congratutaltions Your guess is Right , the answer is " + number);
                return;
            }
            attempts = attempts - 1;
            System.out.println("remaining attempts are " + attempts);
        }
        System.out.println("Better Luck next time, the answer is " + number);
    }

    public static void easyAttempts(int attempts, int number) {
        System.out.println("You have " + attempts + " attempts remaining to guess the number");
        while (attempts > 0) {
            if (check_guess(number) == true) {
                System.out.println("Congratutaltions Your guess is Right , the answer is " + number);
                return;
            }
            attempts = attempts - 1;
            System.out.println("remaining attempts are " + attempts);
        }
        System.out.println("Better Luck next time, the answer is " + number);
    }

    public static boolean check_guess(int number) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guess=sc.nextInt();
        if(guess>number){
            System.out.println("You guessed too high");
            return false;
        }else if(guess<number){
            System.out.println("You guessed too small");
            return false;
        }else{
            return true;
        }
    }
}
