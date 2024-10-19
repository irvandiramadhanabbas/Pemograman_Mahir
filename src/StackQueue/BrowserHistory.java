package StackQueue;

import java.util.Stack;
import java.util.Scanner;

    public class Main {
        // Stack untuk menyimpan history browser
        private Stack<String> history;

        // Constructor untuk menginisialisasi stack
        public BrowserHistory() {
            history = new Stack<>();
        }

        // Fungsi browse untuk menambahkan website baru ke history
        public void browse(String url) {
            history.push(url);
            System.out.println("Browsing: " + url);
        }

        // Fungsi back untuk kembali ke website sebelumnya
        public void back() {
            if (history.isEmpty()) {
                System.out.println("No more history to go back to.");
            } else {
                String lastVisited = history.pop();
                System.out.println("Going back from: " + lastVisited);
                if (!history.isEmpty()) {
                    System.out.println("Now at: " + history.peek());
                } else {
                    System.out.println("No more history available.");
                }
            }
        }

        // Fungsi view untuk menampilkan semua history dari yang terbaru
        public void view() {
            if (history.isEmpty()) {
                System.out.println("No browsing history.");
            } else {
                System.out.println("Browsing history (from most recent):");
                Stack<String> temp = (Stack<String>) history.clone(); // Cloning the stack
                while (!temp.isEmpty()) {
                    System.out.println(temp.pop());
                }
            }
        }

        public static void main(String[] args) {
            BrowserHistory browserHistory = new BrowserHistory();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nEnter command (browse/view/back/exit):");
                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("browse")) {
                    System.out.println("Enter website URL:");
                    String url = scanner.nextLine();
                    browserHistory.browse(url);
                } else if (command.equalsIgnoreCase("view")) {
                    browserHistory.view();
                } else if (command.equalsIgnoreCase("back")) {
                    browserHistory.back();
                } else if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program.");
                    break;
                } else {
                    System.out.println("Invalid command.");
                }
            }

            scanner.close();
        }
    }
