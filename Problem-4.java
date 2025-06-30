import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter length of input:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // hasmap which stores key-value pair , key-(1-9) : value-(No. of multiple in the input)
        HashMap<Integer, Integer> dict = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % i == 0) {
                    count++;
                }
            }
            dict.put(i, count);
        }
        //print output in dictionary format
        System.out.println("Output:");
        System.out.println("{");
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("}");
    }
}
