package homework.RestaurantTables.Presenter.interfaces;

public interface ITablePresenter {
    void updateTablesStatus();
    boolean onTableSelected(int hallNumber, int tableNumber);
    boolean onTableReleased(int hallNumber, int tableNumber);
}
