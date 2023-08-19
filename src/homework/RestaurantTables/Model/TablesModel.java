package homework.RestaurantTables.Model;


import homework.RestaurantTables.Model.interfaces.ITablesModel;

public class TablesModel implements ITablesModel {
    private boolean[][] tablesStatus; // true - booked, false - vacant

    public TablesModel() {
        tablesStatus = new boolean[2][3];
    }

    @Override
    public boolean bookTable(int hallNumber, int tableNumber) {
        if (hallNumber < 1 || hallNumber > 2 || tableNumber < 1 || tableNumber > 3) {
            return false;
        }

        if (!tablesStatus[hallNumber - 1][tableNumber - 1]) {
            tablesStatus[hallNumber - 1][tableNumber - 1] = true;
            return true;
        }

        return false;
    }

    @Override
    public boolean releaseTable(int hallNumber, int tableNumber) {
        if (hallNumber < 1 || hallNumber > 2 || tableNumber < 1 || tableNumber > 3) {
            return false;
        }

        if (tablesStatus[hallNumber - 1][tableNumber - 1]) {
            tablesStatus[hallNumber - 1][tableNumber - 1] = false;
            return true;
        }

        return false;
    }

    @Override
    public String[][] getTablesStatus() {
        String[][] status = new String[2][3];
        for (int hall = 0; hall < 2; hall++) {
            for (int table = 0; table < 3; table++) {
                status[hall][table] = tablesStatus[hall][table] ? "Booked" : "Vacant";
            }
        }
        return status;
    }

}
