import java.math.BigDecimal;
import java.util.Scanner;


public class Editor {

    static BigDecimal totalDollarsIn;
    static BigDecimal totalDollarsOut;
    static BigDecimal income;
    static BigDecimal bills;
    static BigDecimal food;
    static BigDecimal entertainment;
    static BigDecimal savings;
    static BigDecimal junk;
    static int totalAmountOfTransactions;
    static double percentageBreakdown;
    static int cents;
    static int dollars;
    static Scanner editorScanner = new Scanner(System.in);
    public static void financeEditor(){
        System.out.println("Which category would you like to change?");
        System.out.println("1. Income\n2. Bills\n3. Food\n4. Entertainment\n5. Savings\n6. Junk");
        int editorCategorySelectionUserInput = editorScanner.nextInt();
        switch(editorCategorySelectionUserInput) {
            case 1:
                System.out.println("Income");
                break;
            case 2:
                System.out.println("Bills");
                break;
            case 3:
                System.out.println("Food");
                break;
            case 4:
                System.out.println("Entertainment");
                break;
            case 5:
                System.out.println("Savings");
                break;
            case 6:
                System.out.println("Junk");
                break;
            default:
                System.out.println("Incorrect choice!");
                financeEditor();
                break;
        }
        System.out.println("Add or Remove data?\n1. Add\n2. Remove");
        int editorAddOrRemoveSelection = editorScanner.nextInt();
        switch(editorAddOrRemoveSelection){
            case 1:
                addFinancialData(editorCategorySelectionUserInput);
            case 2:
                removeFinancialData(editorCategorySelectionUserInput);
        }
        ProgramStart.programStart();
    }
    public static void addFinancialData(int addFinancialDataChosenCategory){

    }
    public static void removeFinancialData(int removeFinancialDataChosenCategory){

    }
}
