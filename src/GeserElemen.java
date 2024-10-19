import java.util.Scanner;

public class GeserElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pergeseran: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan kalimat: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int n = words.length;
        shift = shift % n;

        String[] shiftedWords = new String[n];
        for (int i = 0; i < n; i++) {
            shiftedWords[(i + shift) % n] = words[i];
        }

        String shiftedSentence = String.join(" ", shiftedWords);
        System.out.println("Kalimat setelah digeser: " + shiftedSentence);

        scanner.close();
    }
}
