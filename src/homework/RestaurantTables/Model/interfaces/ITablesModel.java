package homework.RestaurantTables.Model.interfaces;

public interface ITablesModel {
    boolean bookTable(int hallNumber, int tableNumber);
    boolean releaseTable(int hallNumber, int tableNumber);
    String[][] getTablesStatus();
}
