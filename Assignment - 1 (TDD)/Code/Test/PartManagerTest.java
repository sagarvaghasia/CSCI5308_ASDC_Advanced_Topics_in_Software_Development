package Test;

import Order.DeliveryAddress;
import PartManager.IPartmanager;

public class PartManagerTest {
    IPartmanager partManagerMock = new PartManagerMock();
    DeliveryAddress deliveryAddress = new DeliveryAddress();

    void BadWrongPartNumberForPartManager() {
        IPartmanager.PartResponse response = partManagerMock.SubmitPartForManufactureAndDelivery(1212, 2, deliveryAddress);
        if (response.equals(IPartmanager.PartResponse.NO_LONGER_MANUFACTURED)) {
            System.out.println("PASS-BadWrongPartNumberForPartManager");
        } else {
            System.out.println("FAIL-BadWrongPartNumberForPartManager");
        }
    }

    void BadRightFirstPartNumberWrongQuantityForPartManager() {
        IPartmanager.PartResponse response = partManagerMock.SubmitPartForManufactureAndDelivery(1234, 3, deliveryAddress);
        if (response.equals(IPartmanager.PartResponse.OUT_OF_STOCK)) {
            System.out.println("PASS-BadRightFirstPartNumberWrongQuantityForPartManager");
        } else {
            System.out.println("FAIL-BadRightFirstPartNumberWrongQuantityForPartManager");
        }
    }

    void BadRightSecondPartNumberWrongQuantityForPartManager() {
        IPartmanager.PartResponse response = partManagerMock.SubmitPartForManufactureAndDelivery(5678, 26, deliveryAddress);
        if (response.equals(IPartmanager.PartResponse.OUT_OF_STOCK)) {
            System.out.println("PASS-BadRightSecondPartNumberWrongQuantityForPartManager");
        } else {
            System.out.println("FAIL-BadRightSecondPartNumberWrongQuantityForPartManager");
        }
    }

    void GoodRightFirstPartNumberRightQuantityForPartManager() {
        IPartmanager.PartResponse response = partManagerMock.SubmitPartForManufactureAndDelivery(1234, 2, deliveryAddress);
        if (response.equals(IPartmanager.PartResponse.SUCCESS) && deliveryAddress.getName().equals("Mrs. Jane Smith")) {
            System.out.println("PASS-GoodRightFirstPartNumberRightQuantityForPartManager");
        } else {
            System.out.println("FAIL-GoodRightFirstPartNumberRightQuantityForPartManager");
        }
    }

    void GoodRightSecondPartNumberRightQuantityForPartManager() {
        IPartmanager.PartResponse response = partManagerMock.SubmitPartForManufactureAndDelivery(5678, 25, deliveryAddress);
        if (response.equals(IPartmanager.PartResponse.SUCCESS) && deliveryAddress.getName().equals("Mrs. Jane Smith")) {
            System.out.println("PASS-GoodRightSecondPartNumberRightQuantityForPartManager");
        } else {
            System.out.println("FAIL-GoodRightSecondPartNumberRightQuantityForPartManager");
        }
    }
}
