import java.math.BigDecimal;
import java.util.Scanner;


public class Editor {
    static BigDecimal income = BigDecimal.valueOf(0.00);
    static BigDecimal bills = BigDecimal.valueOf(0.00);
    static BigDecimal food = BigDecimal.valueOf(0.00);
    static BigDecimal entertainment = BigDecimal.valueOf(0.00);
    static BigDecimal savings = BigDecimal.valueOf(0.00);
    static BigDecimal junk = BigDecimal.valueOf(0.00);
    static int totalAmountOfTransactions;
    static double percentageBreakdown;
    static int cents;
    static int dollars;
    static BigDecimal totalDollarsIn = BigDecimal.valueOf(0.00);
    static BigDecimal totalDollarsOut = BigDecimal.valueOf(0.00);
    static Scanner editorScanner = new Scanner(System.in);
    public static void financeEditor(){
        System.out.println("Which category would you like to change?");
        System.out.println("1. Income\n2. Bills\n3. Food\n4. Entertainment\n5. Savings\n6. Junk");
        int editorCategoryUserInput = editorScanner.nextInt();
        switch(editorCategoryUserInput) {
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
                addFinancialData(editorCategoryUserInput);
                break;
            case 2:
                removeFinancialData(editorCategoryUserInput);
                break;
        }
        ProgramStart.programStart();
    }
    public static void addFinancialData(int addFinancialDataChosenCategory){
        System.out.println("How much would you like to add? FORMAT -> Dollars.Cents");
        BigDecimal addFinancialDataAmount = editorScanner.nextBigDecimal();

        switch(addFinancialDataChosenCategory){
            case 1:
                income = income.add(addFinancialDataAmount);
                System.out.println("Total Income: $" + income);
                break;
            case 2:
                bills = bills.add(addFinancialDataAmount);
                System.out.println("Total Bills Paid: $" + bills);
                break;
            case 3:
                food = food.add(addFinancialDataAmount);
                System.out.println("Total Spent on Food: $" + food);
                break;
            case 4:
                entertainment = entertainment.add(addFinancialDataAmount);
                System.out.println("Total Spent on Entertainment: $" + entertainment);
                break;
            case 5:
                savings = savings.add(addFinancialDataAmount);
                System.out.println("Total Expected Savings: $" + savings);
                break;
            case 6:
                junk = junk.add(addFinancialDataAmount);
                System.out.println("Total WASTED on Junk: $" + junk);
                break;
        }
    }
    public static void removeFinancialData(int removeFinancialDataChosenCategory){
        System.out.println("How much would you like to remove? FORMAT -> Dollars.Cents");
        BigDecimal removeFinancialDataAmount = editorScanner.nextBigDecimal();

        switch(removeFinancialDataChosenCategory){
            case 1:
                income = income.subtract(removeFinancialDataAmount);
                System.out.println("Total Income: $" + income);
                break;
            case 2:
                bills = bills.subtract(removeFinancialDataAmount);
                System.out.println("Total Bills Paid: $" + bills);
                break;
            case 3:
                food = food.subtract(removeFinancialDataAmount);
                System.out.println("Total Spent on Food: $" + food);
                break;
            case 4:
                entertainment = entertainment.subtract(removeFinancialDataAmount);
                System.out.println("Total Spent on Entertainment: $" + entertainment);
                break;
            case 5:
                savings = savings.subtract(removeFinancialDataAmount);
                System.out.println("Total Expected Savings: $" + savings);
                break;
            case 6:
                junk = junk.subtract(removeFinancialDataAmount);
                System.out.println("Total WASTED on Junk: $" + junk);
                break;
        }
        System.out.println("You have removed: $" + removeFinancialDataAmount + " from your records.");
    }
}
