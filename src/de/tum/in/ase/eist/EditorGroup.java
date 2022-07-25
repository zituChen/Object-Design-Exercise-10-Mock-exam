package de.tum.in.ase.eist;

import java.util.Map;

public class EditorGroup extends Group{


    private final OAuthAuthentication oAuthAuthentication;

    public EditorGroup(OAuthAuthentication oAuthAuthentication) {

       this.oAuthAuthentication = oAuthAuthentication;
    }

    @Override
    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return oAuthAuthentication.login(loginName, request);
    }
    // TODO
}
