import java.util.Scanner;

public class ProgramStart {

    public static void programStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Finance Manager v0.1\nWhat would you like to do?");
        System.out.println("1. Load File\n2. Save File\n3. View Finances\n4. Edit Finances\n5. Exit Program");
        var userInput = scanner.nextLine();
        switch (userInput){
            case "1" :
                Main.whiteSpace(2);
                DataStorage.loadFromFile();
                break;
            case "2" :
                Main.whiteSpace(2);
                DataStorage.saveToFile();
                break;
            case "3" :
                Main.whiteSpace(2);
                Category.reportCategory();
                break;
            case "4" :
                Main.whiteSpace(2);
                Editor.financeEditor();
                break;
            case "5" :
                exitProgram();
            default:
                System.out.println("Unexpected value: " + userInput);
                Main.whiteSpace(2);
                programStart();
                break;
        }
    }
    public static void exitProgram(){
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
