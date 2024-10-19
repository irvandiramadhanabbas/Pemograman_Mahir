import java.util.Scanner;

public class ElemenTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan beberapa angka bulat (pisahkan dengan spasi): ");
        String input = scanner.nextLine();

        String[] stringNumbers = input.split(" ");

        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Angka terbesar adalah: " + largest);

        scanner.close();
    }
}
