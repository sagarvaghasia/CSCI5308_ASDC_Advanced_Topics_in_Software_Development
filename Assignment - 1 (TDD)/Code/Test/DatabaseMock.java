package Test;

import Database.IDatabase;
import Order.Order;
import Order.Item;
import Order.OrderItems;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMock implements IDatabase {
    @Override
    public ValidationResult validateItem(String partNumber, Order order) {
        if (partNumber.isEmpty()) {
            return ValidationResult.VALIDATION_FAILURE;
        }
        if (partNumber.equals("1234") || partNumber.equals("5678")) {
            List<Item> itemList = new ArrayList<Item>();
            Item item = new Item();
            item.setPartNumber("1234");
            item.setQuantity("2");
            itemList.add(item);
            Item item1 = new Item();
            item1.setPartNumber("5678");
            item1.setQuantity("25");
            itemList.add(item1);
            OrderItems orderItems = new OrderItems();
            orderItems.setItem(itemList);
            order.setOrderItems(orderItems);
            return ValidationResult.VALIDATION_SUCCESS;
        }
        return ValidationResult.VALIDATION_FAILURE;
    }

}
