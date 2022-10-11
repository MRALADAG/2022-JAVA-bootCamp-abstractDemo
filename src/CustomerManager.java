public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;

    // * Strateji patterni
    public void getCustomers() {
        baseDatabaseManager.getData();
        // * Bu işleme strateji patterni denilmektedir.
    }
}
