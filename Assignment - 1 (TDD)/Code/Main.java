import Order.Order;
import Order.Item;
import Order.DeliveryAddress;
import PartManager.IPartmanager;
import Test.DatabaseMock;
import Test.PartManagerMock;
import Test.TestMain;

public class Main {

    public static void main(String[] args) {
        try {
            String FileName = args[0];
            Order order = new Order();
            ParseXML.ParseXML(order, FileName);
            DatabaseMock databaseMock = new DatabaseMock();
            IPartmanager partManager = new PartManagerMock();
            DeliveryAddress deliveryAddress = new DeliveryAddress();
            System.out.println(order.validateXML(order));
            for (Item item : order.getOrderItems().getItem()) {
                System.out.println("Item " + item.getPartNumber() + " " + order.validateItem(item.getPartNumber(), databaseMock));
                System.out.println("Part Manager Submission " + item.getPartNumber() + " " + partManager.SubmitPartForManufactureAndDelivery(Integer.parseInt(item.getPartNumber()), Integer.parseInt(item.getQuantity()), deliveryAddress));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            TestMain testMain = new TestMain();
        }
    }

}
