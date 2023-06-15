package Database;

import Order.Order;

public class Database implements IDatabase {
    @Override
    public ValidationResult validateItem(String partNumber, Order orderItems) {
        System.out.println("No implementation Yet for validation");
        return null;
    }
}
