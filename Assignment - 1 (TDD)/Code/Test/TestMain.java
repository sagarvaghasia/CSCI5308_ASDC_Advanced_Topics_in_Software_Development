package Test;

public class TestMain {
    static {
        SecurityTest securityTest = new SecurityTest();
        DatabaseTest databaseTest = new DatabaseTest();
        PartManagerTest partManagerTest = new PartManagerTest();
        OrderTest orderTest = new OrderTest();
        securityTest.BadDealerAuthorizationTestWrongDealerId();
        securityTest.BadDealerAuthorizationTestWrongDealerAccessKey();
        securityTest.BadDealerAuthorizationTestWrongDealerIDANDWrongAccessKey();
        securityTest.BadDealerAuthorizationTestEmptyDealerId();
        securityTest.BadDealerAuthorizationTestEmptyDealerAccessKey();
        securityTest.GoodDealerAuthorizationTest();
        databaseTest.BadValidateItemForEmptyValue();
        databaseTest.BadValidateItemForFirstItemWrongValue();
        databaseTest.GoodValidateItemForFirstItem();
        databaseTest.BadValidateItemForSecondItemWrongValue();
        databaseTest.GoodValidateItemForSecondItem();
        partManagerTest.BadRightFirstPartNumberWrongQuantityForPartManager();
        partManagerTest.BadWrongPartNumberForPartManager();
        partManagerTest.BadRightSecondPartNumberWrongQuantityForPartManager();
        partManagerTest.GoodRightFirstPartNumberRightQuantityForPartManager();
        partManagerTest.GoodRightSecondPartNumberRightQuantityForPartManager();
        orderTest.BadEmptyOrderItemQuantity();
        orderTest.BadEmptyOrderItemPartNumber();
        orderTest.GoodOrderItemPartNumberQuantityValidation();
        orderTest.BadValidateEmptyPostalCode();
        orderTest.BadValidateEmptyCity();
        orderTest.BadValidateEmptyStreet();
        orderTest.BadValidateEmptyProvince();
        orderTest.GoodValidateDeliveryAddress();
    }

}
