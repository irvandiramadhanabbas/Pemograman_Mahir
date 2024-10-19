import java.util.Scanner;

public class PerbedaanElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pada baris pertama (pisahkan dengan spasi):");
        String[] input1 = scanner.nextLine().split(" ");
        int[] array1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            array1[i] = Integer.parseInt(input1[i]);
        }

        System.out.println("Masukkan angka pada baris kedua (pisahkan dengan spasi):");
        String[] input2 = scanner.nextLine().split(" ");
        int[] array2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            array2[i] = Integer.parseInt(input2[i]);
        }
        System.out.println("Angka yang berbeda di antara dua array:");

        for (int i = 0; i < array1.length; i++) {
            boolean ditemukan = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.print(array1[i] + " ");
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean ditemukan = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
