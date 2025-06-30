import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Input should be at least 1");
        }
        //output logic to print n odd numbers
        int odd = 1;
        for (int i = 1; i <= n; i++){
            System.err.print(odd + " ");
            odd += 2;
        }
    }
}
