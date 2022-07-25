package de.tum.in.ase.eist;

import java.util.Map;

public abstract class Group {

    private AuthenticationMethod authenticationMethod;

    public abstract boolean checkLogin(String loginName, Map<LoginRequestType, String> request) ;
}
