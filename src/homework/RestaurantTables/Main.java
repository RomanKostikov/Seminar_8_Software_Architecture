package homework.RestaurantTables;

import homework.RestaurantTables.Presenter.TablesPresenter;
import homework.RestaurantTables.Presenter.interfaces.ITablePresenter;
import homework.RestaurantTables.View.ConsoleTablesView;
import homework.RestaurantTables.View.interfaces.ITablesView;

public class Main {
    public static void main(String[] args) {
        ITablesView view = new ConsoleTablesView();
        ITablePresenter presenter = new TablesPresenter(view);

        boolean exit = false;
        while (!exit) {
            presenter.updateTablesStatus();
            int option = view.selectOption();

            switch (option) {
                case 1 -> {
                    int hallNumber = view.selectHall();
                    int tableNumber = view.selectTable();
                    boolean success = presenter.onTableSelected(hallNumber, tableNumber);
                    if (success) {
                        System.out.println("Table booked successfully!");
                    } else {
                        System.out.println("Table is already booked!");
                    }
                }
                //  освобождения столика
                case 2 -> {
                    int hallNumber = view.selectHall();
                    int tableNumber = view.selectTable();
                    boolean success = presenter.onTableReleased(hallNumber, tableNumber);
                    if (success) {
                        System.out.println("Table released successfully!");
                    } else {
                        System.out.println("Table is already vacant!");
                    }
                }
                case 0 -> {
                    exit = true;
                    System.out.println("Exiting the program.");
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

}
