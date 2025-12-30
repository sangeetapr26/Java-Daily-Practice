import java.util.Scanner;

public class NotesCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("number of $5 notes: ");
        int fiveNotes = sc.nextInt();

        System.out.println("number of $1 notes: ");
        int oneNotes = sc.nextInt();

        System.out.println("Amount to be paid: ");
        int amountToBePaid = sc.nextInt();

        int fiveNotesUsed = Math.min(fiveNotes, amountToBePaid / 5);

        int remainingAmount = amountToBePaid - (fiveNotesUsed * 5);

        if (remainingAmount <= oneNotes) {
            System.out.println("$5 notes needed = " + fiveNotesUsed);
            System.out.println("$1 notes needed = " + remainingAmount);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
