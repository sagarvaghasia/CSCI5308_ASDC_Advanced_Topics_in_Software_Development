package Database;

import Order.Order;

public interface IDatabase {

    enum ValidationResult {
        VALIDATION_FAILURE,
        VALIDATION_SUCCESS
    }

    public ValidationResult validateItem(String partNumber, Order orderItems);
}
