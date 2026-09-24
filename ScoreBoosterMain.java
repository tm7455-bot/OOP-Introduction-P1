import java.util.Arrays;
import java.util.Scanner;

class ScoreBooster {

    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }
}

public class ScoreBoosterMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of scores: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.print("Enter bonus: ");
        int bonus = sc.nextInt();

        ScoreBooster.curveScores(scores, bonus);

        System.out.println("Final Leaderboard: " + Arrays.toString(scores));

        sc.close();
    }
}