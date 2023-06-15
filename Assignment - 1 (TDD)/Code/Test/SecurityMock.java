package Test;

import Security.ISecurity;

public class SecurityMock implements ISecurity {
    @Override
    public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey) {
        if (dealerid.isEmpty() || dealeraccesskey.isEmpty()) {
            return false;
        }
        if (dealerid.equals("XXX-1234-ABCD-1234") && dealeraccesskey.equals("kkklas8882kk23nllfjj88290")) {
            return true;
        }
        return false;
    }
}
