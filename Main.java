import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        programStart();
    }
    public static void programStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Finance Manager v0.1\nWhat would you like to do?");
        System.out.println("1. Load File\n2. Save File\n3. View Finances\n4. Edit Finances\n5. Exit Program");
        var userInput = scanner.nextLine();
        switch (userInput){
            case "1" :
                DataStorage.loadFromFile();
                break;
            case "2" :
                DataStorage.saveToFile();
                break;
            case "3" :
                Category.reportCategory();
                break;
            case "4" :
                Editor.financeEditor();
                break;
            case "5" :
                exitProgram();
            default:
                System.out.println("Unexpected value: " + userInput);
                programStart();
                break;
        }
    }
    public static void exitProgram(){
        System.out.println("Goodbye!");
            System.exit(0);
    }
}