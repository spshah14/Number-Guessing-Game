import java.util.Scanner;

class game {
    int unum;
    int num;
    int noOfGuesses = 0;
    int max = 100;
    int min = 1;

    public game() {

        int gnum = (int) (Math.random() * (max - min + 1) + min);
        num = gnum;
    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you guess: ");
        unum = sc.nextInt();
        return unum;
    }

    public void isCorrectNumber() {
        if (unum == num) {
            System.out.println();
            System.out.println("Congratulations...! You guess the Right number...You Win the game...!");
        } else if (unum > num) {
            System.out.println("Your number is bigger than actual number. Try again...!");
            System.out.println();
        } else if (unum < num) {
            System.out.println("Your number is smaller than actual number. Try again...!");
            System.out.println();
        }
    }

}

public class ex3_game {
    public static void main(String[] args) {
        game g1 = new game();

        System.out.println();

        do {
            g1.noOfGuesses++;
            if (g1.noOfGuesses > 7) {
                System.out.println();
                System.out.println(
                        "Sorry...You guess 7 times but until you not guess correct answer. so you lose the game...");
                System.out.println("Actual Number is " + g1.num);
                break;
            }
            g1.takeUserInput();
            g1.isCorrectNumber();
        } while (g1.unum != g1.num);

        if (g1.unum == g1.num) {
            System.out.println();
            System.out.printf("You taking total %d guesses for guess the correct answer...!", g1.noOfGuesses);
            System.out.println();
        }

    }
}
