import java.util.Scanner;

public class convert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in subject 1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter maximum marks possible in subject 1: ");
        int max1 = sc.nextInt();

        System.out.println("Enter marks in subject 2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter maximum marks possible in subject 2: ");
        int max2 = sc.nextInt();

        System.out.println("Enter marks in subject 3: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter maximum marks possible in subject 3: ");
        int max3 = sc.nextInt();

        System.out.println("Enter marks in subject 4: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter maximum marks possible in subject 4: ");
        int max4 = sc.nextInt();

        System.out.println("Enter marks in subject 5: ");
        int sub5 = sc.nextInt();
        System.out.println("Enter maximum marks possible in subject 5: ");
        int max5 = sc.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.print("Total sum of marks: ");
        System.out.println(sum);

        int maxMarks = max1 + max2 + max3 + max4 + max5;
        System.out.print("Maximum total marks possible: ");
        System.out.println(maxMarks);

        float percentage = 100 * sum / maxMarks;
        System.out.print("Percentage scored: ");
        System.out.println(percentage);


    }
}
