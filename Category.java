import java.util.Scanner;


public class Category {

    public static void reportCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which category would you like to view?");
        System.out.println("1. Total In/Out\n2. Income\n3. Bills\n4. Food\n5. Entertainment\n6. Savings\n7. Junk\n8. Amount of transactions\n9. Pecentage Breakdown");
        int categoryChoice = scanner.nextInt();
        categorySelector(categoryChoice);
        Main.whiteSpace(2);
        ProgramStart.programStart();
    }

    public static void categorySelector(int userInput){
        switch (userInput){
            case 1 :
                System.out.println("Your in/out is: " + Editor.income + " / " + Editor.totalDollarsOut);
                System.out.println("Amount placed into Savings from TOTAL Out: " + Editor.savings);
                System.out.println("You are currently +\\-: " + Editor.income.subtract(Editor.totalDollarsOut));
                break;
            case 2 :
                System.out.println("Your income is: " + Editor.income);
                break;
            case 3 :
                System.out.println("Sum of your recurring bills: " + Editor.bills);
                break;
            case 4 :
                System.out.println("Total amount spent on food: " +  Editor.food);
                break;
            case 5 :
                System.out.println("Total amount spent on entertainment: " + Editor.entertainment);
                break;
            case 6 :
                System.out.println("Total savings: " + Editor.savings);
                break;
            case 7 :
                System.out.println("Total money wasted on junk: " + Editor.junk);
                break;
            case 8 :
                System.out.println("Total amount spent on gas: " + Editor.gas);
                break;
            case 9 :
                System.out.println("Total days where spending has occurred: " + Editor.totalAmountOfTransactions);
                break;
            case 10 :
                System.out.println("Pecentage breakdown of all categories: ");
                break;
            default:
                System.out.println("Unexpected value: " + userInput);
                reportCategory();
                break;
        }
    }
}

