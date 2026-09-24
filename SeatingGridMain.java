import java.util.Scanner;

class SeatingGridOptimizer {

    private double rowAverage(int[] row) {
        int sum = 0;

        for (int value : row) {
            sum += value;
        }

        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        SeatingGridOptimizer obj = new SeatingGridOptimizer();

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            double average = obj.rowAverage(seatingScores[i]);

            if (average < threshold) {
                result += "Row " + i + ": Quiet Zone";
            } else {
                result += "Row " + i + ": Buzzing Zone";
            }

            if (i < seatingScores.length - 1) {
                result += " | ";
            }
        }

        return result;
    }
}

public class SeatingGridMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] seatingScores = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.print("Enter number of seats in row " + i + ": ");
            int columns = sc.nextInt();

            seatingScores[i] = new int[columns];

            System.out.println("Enter scores:");

            for (int j = 0; j < columns; j++) {
                seatingScores[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        String result = SeatingGridOptimizer.classifyRows(
                seatingScores, threshold);

        System.out.println(result);

        sc.close();
    }
}