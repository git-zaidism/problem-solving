import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum = reverse(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    private static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int lastDigit =  num % 10;
            reversedNum = reversedNum*10 + lastDigit;
            num = num/10;
        }
        return reversedNum;
    }
}
