import java.util.*;

class problem3{
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        //condition for even value of n
        int terms = (n % 2 == 0) ? n - 1 : n;
        int number = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < terms; i++) {
            result.append(number);
            number += 2;
            if (i < terms - 1) {
                result.append(", ");
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
