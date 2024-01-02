import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        if (number <= 0){
            System.out.println("Проверьте введённые данные.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
