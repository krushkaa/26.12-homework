import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Ваше число чётное");
        } else {
            System.out.println("Ваше число нечётное");
        }
    }
}
