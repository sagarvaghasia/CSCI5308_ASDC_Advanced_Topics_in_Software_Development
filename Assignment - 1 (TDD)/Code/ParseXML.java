import Order.Order;
import Order.Dealer;
import Order.OrderItems;
import Order.Item;
import Order.DeliveryAddress;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseXML {
    public static void ParseXML(Order order, String FileName) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(FileName));

            NodeList list1 = doc.getElementsByTagName("dealer");
            for (int i = 0; i < list1.getLength(); i++) {
                Node node = list1.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String dealerid = element.getElementsByTagName("dealerid").item(0).getTextContent();
                    String dealeraccesskey = element.getElementsByTagName("dealeraccesskey").item(0).getTextContent();

                    Dealer dealer = new Dealer();
                    dealer.setDealerId(dealerid);
                    dealer.setDealerAccessKey(dealeraccesskey);
                    order.setDealer(dealer);
                }
            }

            NodeList list2 = doc.getElementsByTagName("orderitems");
            for (int i = 0; i < list2.getLength(); i++) {
                Node node = list2.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    OrderItems orderItems = new OrderItems();
                    List<Item> itemList = new ArrayList<Item>();

                    NodeList list4 = doc.getElementsByTagName("item");

                    for (int j = 0; j < list4.getLength(); j++) {
                        Node node1 = list4.item(j);
                        if (node1.getNodeType() == Node.ELEMENT_NODE) {
                            Element element1 = (Element) node1;
                            String partnumber = element1.getElementsByTagName("partnumber").item(0).getTextContent();
                            String quantity = element1.getElementsByTagName("quantity").item(0).getTextContent();

                            Item item = new Item();
                            item.setPartNumber(partnumber);
                            item.setQuantity(quantity);
                            itemList.add(item);
                        }
                    }
                    orderItems.setItem(itemList);
                    order.setOrderItems(orderItems);
                }
            }

            NodeList list3 = doc.getElementsByTagName("deliveryaddress");
            DeliveryAddress deliveryAddress = new DeliveryAddress();
            for (int i = 0; i < list3.getLength(); i++) {
                Node node = list3.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String street = element.getElementsByTagName("street").item(0).getTextContent();
                    String city = element.getElementsByTagName("city").item(0).getTextContent();
                    String province = element.getElementsByTagName("province").item(0).getTextContent();
                    String postalcode = element.getElementsByTagName("postalcode").item(0).getTextContent();

                    deliveryAddress.setName(name);
                    deliveryAddress.setStreet(street);
                    deliveryAddress.setCity(city);
                    deliveryAddress.setProvince(province);
                    deliveryAddress.setPostalCode(postalcode);
                    order.setDeliveryAddress(deliveryAddress);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("XML is not in Valid format");

        } catch (NullPointerException exception) {
            System.out.println("Invalid order item list");
        }
    }
}
