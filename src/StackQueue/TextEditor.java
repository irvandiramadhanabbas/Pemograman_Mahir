package StackQueue;

import java.util.Stack;
import java.util.Scanner;

    public class TextEditor {
        private Stack<String> undoStack;
        private Stack<String> redoStack;
        private String currentText;

        // Constructor
        public TextEditor() {
            undoStack = new Stack<>();
            redoStack = new Stack<>();
            currentText = "";
        }

        public void write(String newText) {
            undoStack.push(currentText);
            redoStack.clear();
            currentText += newText;
            System.out.println("Text after writing: " + currentText);
        }

        public void undo() {
            if (!undoStack.isEmpty()) {
                redoStack.push(currentText);
                currentText = undoStack.pop();
                System.out.println("Undo completed. Current text: " + currentText);
            } else {
                System.out.println("Nothing to undo.");
            }
        }

        public void redo() {
            if (!redoStack.isEmpty()) {
                undoStack.push(currentText);
                currentText = redoStack.pop();
                System.out.println("Redo completed. Current text: " + currentText);
            } else {
                System.out.println("Nothing to redo.");
            }
        }

        public void show() {
            System.out.println("Current text: " + currentText);
        }

        public static void main(String[] args) {
            TextEditor editor = new TextEditor();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nEnter command (write/show/undo/redo/exit):");
                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("write")) {
                    System.out.println("Enter text to write:");
                    String newText = scanner.nextLine();
                    editor.write(newText);
                } else if (command.equalsIgnoreCase("show")) {
                    editor.show();
                } else if (command.equalsIgnoreCase("undo")) {
                    editor.undo();
                } else if (command.equalsIgnoreCase("redo")) {
                    editor.redo();
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