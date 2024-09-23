import java.util.*;
public class question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(firstNumber + secondNumber); 
        }else if (operator == '-') {
            System.out.println(firstNumber - secondNumber);
        }else if (operator == '*') {
            System.out.println(firstNumber * secondNumber);
        }else if (operator == '/') {
            System.out.println(firstNumber / secondNumber);
        }
            
        }
    }

