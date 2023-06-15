package Test;

import Order.DeliveryAddress;
import PartManager.IPartmanager;

public class PartManagerMock implements IPartmanager {
    @Override
    public PartResponse SubmitPartForManufactureAndDelivery(int partNumber, int quantity, DeliveryAddress deliveryAddress) {

        if (partNumber != 1234 && partNumber != 5678) {
            return PartResponse.NO_LONGER_MANUFACTURED;
        }

        if ((partNumber == 1234 && quantity > 2) || (partNumber == 5678 && quantity > 25)) {
            return PartResponse.OUT_OF_STOCK;
        }
        deliveryAddress.setName("Mrs. Jane Smith");
        deliveryAddress.setProvince("NS");
        deliveryAddress.setPostalCode("B2T1A4");
        deliveryAddress.setCity("Halifax");
        deliveryAddress.setStreet("35 Streetname");
        return PartResponse.SUCCESS;
    }

}
