import java.util.Scanner;

class Tests {
    private double sum;
    private int count;

    public void getAverage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter test scores (enter -1 to quit): ");
        double score = scan.nextDouble();

        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (enter -1 to quit):");
            score = scan.nextDouble();
        }
        scan.close();
    }

    public String toString() {
        if (count > 0) {
            double average = Math.round((sum / count) * 100.0) / 100.0;
            return String.format("The average of %d scores entered is %.2f", count, average);
        } else {
            return "No valid test scores entered.";
        }
    }
}
