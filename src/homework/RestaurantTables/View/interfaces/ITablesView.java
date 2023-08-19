package homework.RestaurantTables.View.interfaces;

public interface ITablesView {
    void showTablesStatus(String[][] tablesStatus);
    void showSuccessMessage(String message);
    void showErrorMessage(String message);
    int selectHall();
    int selectTable();
    int selectOption();
}
