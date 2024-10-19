package StackQueue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama file yang akan dibaca: ");
        String fileName = scanner.nextLine();

        System.out.print("Masukkan jumlah potongan yang diinginkan: ");
        int numberOfChunks = scanner.nextInt();

        Queue<String> chunks = splitFile(fileName, numberOfChunks);

        System.out.println("\nHasil potongan file:");
        while (!chunks.isEmpty()) {
            System.out.println(chunks.poll());
        }

        scanner.close();
    }

    public static Queue<String> splitFile(String fileName, int numberOfChunks) {
        Queue<String> chunks = new LinkedList<>();
        StringBuilder chunkBuilder = new StringBuilder();
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                chunkBuilder.append(line).append(System.lineSeparator());
                lineCount++;

                if (lineCount % numberOfChunks == 0) {
                    chunks.offer(chunkBuilder.toString());
                    chunkBuilder.setLength(0);
                    }
                }

                if (chunkBuilder.length() > 0) {
                    chunks.offer(chunkBuilder.toString());
                }
            } catch (IOException e) {
                System.out.println("Error membaca file: " + e.getMessage());
            }

            return chunks;
        }
    }
