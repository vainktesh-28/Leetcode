import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
