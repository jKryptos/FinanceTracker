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
                loadFromFile();
                break;
            case "2" :
                saveToFile();
                break;
            case "3" :
                reportCategory();
                break;
            case "4" :
                financeEditor();
                break;
            case "5" :
                exitProgram();
            default:
                System.out.println("Unexpected value: " + userInput);
                programStart();
                break;
        }
    }
    public static void loadFromFile(){
        System.out.println("File Loaded");
        programStart();
    }
    public static void saveToFile(){
        System.out.println("Saved to file");
        programStart();
    }
    public static void reportCategory(){
        System.out.println("Which category would you like to view?");
        System.out.println("1. Total In/Out\n2. Income\n3. Bills\n4. Food\n5. Entertainment\n6. Savings\n7. Junk\n8. Total Days of Spending\n9. Pecentage Breakdown");
        programStart();
    }
    public static void financeEditor(){
        System.out.println("Which category would you like to change?");
        programStart();
    }
    public static void addFinancialData(){

    }
    public static void removeFinancialData(){

    }
    public static void exitProgram(){
        System.out.println("Goodbye!");
            System.exit(0);
    }
}