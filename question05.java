import java.util.*;
public class question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is largest");
        }else{
            System.out.println("Second number is largest");
        }
    }
}
