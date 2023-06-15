package Test;

import Security.ISecurity;

public class SecurityTest {

    void BadDealerAuthorizationTestWrongDealerId() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("fakeId", "kkklas8882kk23nllfjj88290")) {
            System.out.println("FAIL-BadDealerAuthorizationTestWrongDealerId");
        } else {
            System.out.println("PASS-BadDealerAuthorizationTestWrongDealerId");
        }
    }

    void BadDealerAuthorizationTestWrongDealerAccessKey() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("XXX-1234-ABCD-1234", "fake")) {
            System.out.println("FAIL-BadDealerAuthorizationTestWrongDealerAccessKey");
        } else {
            System.out.println("PASS-BadDealerAuthorizationTestWrongDealerAccessKey");
        }
    }

    void BadDealerAuthorizationTestWrongDealerIDANDWrongAccessKey() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("fake", "fake")) {
            System.out.println("FAIL-BadDealerAuthorizationTestWrongDealerIDANDWrongAccessKey");
        } else {
            System.out.println("PASS-BadDealerAuthorizationTestWrongDealerIDANDWrongAccessKey");
        }
    }

    void BadDealerAuthorizationTestEmptyDealerId() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("", "kkklas8882kk23nllfjj88290")) {
            System.out.println("FAIL-BadDealerAuthorizationTestEmptyDealerId");
        } else {
            System.out.println("PASS-BadDealerAuthorizationTestEmptyDealerId");
        }
    }

    void BadDealerAuthorizationTestEmptyDealerAccessKey() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("XXX-1234-ABCD-1234", "")) {
            System.out.println("FAIL-BadDealerAuthorizationTestEmptyDealerAccessKey");
        } else {
            System.out.println("PASS-BadDealerAuthorizationTestEmptyDealerAccessKey");
        }
    }

    void GoodDealerAuthorizationTest() {
        ISecurity securityMock = new SecurityMock();
        if (securityMock.IsDealerAuthorized("XXX-1234-ABCD-1234", "kkklas8882kk23nllfjj88290")) {
            System.out.println("PASS-GoodDealerAuthorizationTest");
        } else {
            System.out.println("FAIL-GoodDealerAuthorizationTest");
        }

    }
}
