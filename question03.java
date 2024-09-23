import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();

        float simpleInterest = (principle*rate*time)/100;
        System.out.println(simpleInterest);
    }
}
