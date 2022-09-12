
/**
 * A simple program to manage student marks.
 *
 * @author Stijn Potums
 * @version 0.1
 */
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Declare variables
        String unitName;
        int mark;
        int[] studentMarks = new int[25];

        // Get unit name
        Scanner scanUnitName = new Scanner(System.in);
        System.out.println("Please enter unit name");
        unitName = scanUnitName.nextLine();

        // Get student marks
        int numStudents = 25;
        Scanner scanMarks = new Scanner(System.in);

        for (int i = 0; i <= numStudents - 1; i++) {
            int studentID = i + 1;
            do {
                System.out.println("Please enter mark between 0 and 100 for student #" + studentID);
                while (!scanMarks.hasNextInt()) {
                    scanMarks.nextLine();
                    System.out.println("Please enter a number!");
                }
                mark = scanMarks.nextInt();
            } while (!(mark >= 0 && mark <= 100));
            studentMarks[i] = mark;
        }

        System.out.println("Unit name is: " + unitName);
        System.out.println("Student marks are: ");
        System.out.println(Arrays.toString(studentMarks));

        // Highest and lowest marks
        int max = Arrays.stream(studentMarks).max().getAsInt();
        int min = Arrays.stream(studentMarks).min().getAsInt();
        System.out.println("The lowest score is: " + min + " and the highest score: " + max);
    }
}