import java.util.*;

class problem1 {
    //function to calculate 
    public static double calculate(double a, double b, String op) {
        double c = 0;
        switch (op) {
            case "+" -> c = a + b;
            case "-" -> c = a - b;
            case "/" -> c = a / b;
            case "*" -> c = a * b;
            default -> System.out.println("Invalid Operation");
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two number:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Enter an Operation (+,-,/,*) :");
        String op = sc.next();
        System.out.println("Output : "+calculate(a, b, op));
    }
}


