package Test;

import Order.Order;
import Order.Item;
import Order.OrderItems;
import Order.DeliveryAddress;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    void BadEmptyOrderItemQuantity() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid order item entry")) {
            System.out.println("PASS-BadEmptyOrderItemQuantityEmpty");
        } else {
            System.out.println("FAIL-BadEmptyOrderItemQuantityEmpty");
        }
    }

    void BadEmptyOrderItemPartNumber() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid order item entry")) {
            System.out.println("PASS-BadEmptyOrderItemPartNumberEmpty");
        } else {
            System.out.println("FAIL-BadEmptyOrderItemPartNumberEmpty");
        }
    }

    void GoodOrderItemPartNumberQuantityValidation() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid order item entry")) {
            System.out.println("PASS-BadEmptyOrderItemPartNumberEmpty");
        } else {
            System.out.println("FAIL-BadEmptyOrderItemPartNumberEmpty");
        }
    }

    void BadValidateEmptyPostalCode() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setPostalCode("");
        deliveryAddress.setCity("Halifax");
        deliveryAddress.setStreet("35 Streetname");
        deliveryAddress.setProvince("NS");
        order.setDeliveryAddress(deliveryAddress);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid delivery address")) {
            System.out.println("PASS-BadValidateEmptyPostalCode");
        } else {
            System.out.println("FAIL-BadValidateEmptyPostalCode");
        }
    }

    void BadValidateEmptyCity() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setPostalCode("B2T1A4");
        deliveryAddress.setCity("");
        deliveryAddress.setStreet("35 Streetname");
        deliveryAddress.setProvince("NS");
        order.setDeliveryAddress(deliveryAddress);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid delivery address")) {
            System.out.println("PASS-BadValidateEmptyCity");
        } else {
            System.out.println("FAIL-BadValidateEmptyCity");
        }
    }

    void BadValidateEmptyStreet() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setPostalCode("B2T1A4");
        deliveryAddress.setCity("Halifax");
        deliveryAddress.setStreet("");
        deliveryAddress.setProvince("NS");
        order.setDeliveryAddress(deliveryAddress);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid delivery address")) {
            System.out.println("PASS-BadValidateEmptyStreet");
        } else {
            System.out.println("FAIL-BadValidateEmptyStreet");
        }
    }

    void BadValidateEmptyProvince() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setPostalCode("B2T1A4");
        deliveryAddress.setCity("Halifax");
        deliveryAddress.setStreet("35 Streetname");
        deliveryAddress.setProvince("");
        order.setDeliveryAddress(deliveryAddress);
        String Response = order.validateXML(order);
        if (Response.equals("Invalid delivery address")) {
            System.out.println("PASS-BadValidateEmptyProvince");
        } else {
            System.out.println("FAIL-BadValidateEmptyProvince");
        }
    }

    void GoodValidateDeliveryAddress() {
        Order order = new Order();
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setQuantity("2");
        item1.setPartNumber("1234");
        itemList.add(item1);
        OrderItems orderItems = new OrderItems();
        orderItems.setItem(itemList);
        order.setOrderItems(orderItems);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setPostalCode("B2T1A4");
        deliveryAddress.setCity("Halifax");
        deliveryAddress.setStreet("35 Streetname");
        deliveryAddress.setProvince("NS");
        order.setDeliveryAddress(deliveryAddress);
        String Response = order.validateXML(order);
        if (Response.equals("XML Validated Successfully")) {
            System.out.println("PASS-GoodValidateDeliveryAddress");
        } else {
            System.out.println("FAIL-GoodValidateDeliveryAddress");
        }
    }
}
