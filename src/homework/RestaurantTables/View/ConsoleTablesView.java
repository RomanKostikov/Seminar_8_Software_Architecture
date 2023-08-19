package homework.RestaurantTables.View;


import homework.RestaurantTables.View.interfaces.ITablesView;

import java.util.Scanner;

public class ConsoleTablesView implements ITablesView {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void showTablesStatus(String[][] tablesStatus) {
        System.out.println("\nTables Status:");
        System.out.println("-----------------------");
        System.out.println("Hall 1:");
        System.out.println("Table 1: " + tablesStatus[0][0]);
        System.out.println("Table 2: " + tablesStatus[0][1]);
        System.out.println("Table 3: " + tablesStatus[0][2]);
        System.out.println("Hall 2:");
        System.out.println("Table 1: " + tablesStatus[1][0]);
        System.out.println("Table 2: " + tablesStatus[1][1]);
        System.out.println("Table 3: " + tablesStatus[1][2]);
    }

    @Override
    public void showSuccessMessage(String message) {
        System.out.println("\nSUCCESS: " + message);
    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("\nERROR: " + message);
    }

    @Override
    public int selectHall() {
        System.out.println("\nSelect a hall (1 - for smokers, 2 - for non-smokers):");
        int hallNumber = scanner.nextInt();
        while (hallNumber != 1 && hallNumber != 2) {
            System.out.println("Invalid hall number. Try again:");
            hallNumber = scanner.nextInt();
        }
        return hallNumber;
    }

    @Override
    public int selectTable() {
        System.out.println("\nSelect a table (1 - 3):");
        int tableNumber = scanner.nextInt();
        while (tableNumber < 1 || tableNumber > 3) {
            System.out.println("Invalid table number. Try again:");
            tableNumber = scanner.nextInt();
        }
        return tableNumber;
    }

    @Override
    public int selectOption() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Book a table");
        System.out.println("2. Release a table");
        System.out.println("0. Exit");
        int option = scanner.nextInt();
        while (option < 0 || option > 2) {
            System.out.println("Invalid option. Try again:");
            option = scanner.nextInt();
        }
        return option;
    }
}
