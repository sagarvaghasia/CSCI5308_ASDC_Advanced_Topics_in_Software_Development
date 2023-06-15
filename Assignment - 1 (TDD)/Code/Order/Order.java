package Order;

import Database.IDatabase;

import static java.util.Objects.isNull;

public class Order {
    private Dealer dealer;
    private OrderItems orderItems;
    private DeliveryAddress deliveryAddress;

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItems orderItems) {
        this.orderItems = orderItems;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public IDatabase.ValidationResult validateItem(String partNumber, IDatabase database){
        return database.validateItem(partNumber,this);
    };

    public String validateXML(Order order){

        for(Item item: order.getOrderItems().getItem()){
            if(item.getPartNumber().isEmpty() || item.getQuantity().isEmpty()){
                return "Invalid order item entry";
            }
        }
        if(order.getDeliveryAddress().getPostalCode().isEmpty() || order.getDeliveryAddress().getProvince().isEmpty() ||
                order.getDeliveryAddress().getStreet().isEmpty() ||
                order.getDeliveryAddress().getCity().isEmpty()
        ){
            return "Invalid delivery address";
        }
        return "XML Validated Successfully";
    }
}
