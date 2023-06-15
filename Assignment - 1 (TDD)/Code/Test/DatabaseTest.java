package Test;

import Database.IDatabase;
import Order.Order;

public class DatabaseTest {
    Order order = new Order();

    void BadValidateItemForEmptyValue() {
        DatabaseMock databaseMock = new DatabaseMock();
        IDatabase.ValidationResult Result = order.validateItem("", databaseMock);
        if (Result.equals(IDatabase.ValidationResult.VALIDATION_FAILURE)) {
            System.out.println("PASS-BadValidateItemForFirstItem");
        } else {
            System.out.println("FAIL-BadValidateItemForFirstItem");
        }
    }

    void BadValidateItemForFirstItemWrongValue() {
        DatabaseMock databaseMock = new DatabaseMock();
        IDatabase.ValidationResult Result = order.validateItem("7898", databaseMock);
        if (Result.equals(IDatabase.ValidationResult.VALIDATION_FAILURE)) {
            System.out.println("PASS-BadValidateItemForFirstItem");
        } else {
            System.out.println("FAIL-BadValidateItemForFirstItem");
        }
    }

    void GoodValidateItemForFirstItem() {
        DatabaseMock databaseMock = new DatabaseMock();
        IDatabase.ValidationResult Result = order.validateItem("1234", databaseMock);
        if (Result.equals(IDatabase.ValidationResult.VALIDATION_SUCCESS) && order.getOrderItems().getItem().get(0).getQuantity().equals("2")) {
            System.out.println("PASS-GoodValidateItemForFirstItem");
        } else {
            System.out.println("FAIL-GoodValidateItemForFirstItem");
        }
    }

    void BadValidateItemForSecondItemWrongValue() {
        DatabaseMock databaseMock = new DatabaseMock();
        IDatabase.ValidationResult Result = order.validateItem("7898", databaseMock);
        if (Result.equals(IDatabase.ValidationResult.VALIDATION_FAILURE)) {
            System.out.println("PASS-BadValidateItemForFirstItem");
        } else {
            System.out.println("FAIL-BadValidateItemForFirstItem");
        }
    }

    void GoodValidateItemForSecondItem() {
        DatabaseMock databaseMock = new DatabaseMock();
        IDatabase.ValidationResult Result = order.validateItem("5678", databaseMock);
        if (Result.equals(IDatabase.ValidationResult.VALIDATION_SUCCESS) && order.getOrderItems().getItem().get(1).getQuantity().equals("25")) {
            System.out.println("PASS-GoodValidateItemForFirstItem");
        } else {
            System.out.println("FAIL-GoodValidateItemForFirstItem");
        }
    }
}
