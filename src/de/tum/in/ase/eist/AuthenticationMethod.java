package de.tum.in.ase.eist;

import java.util.Map;

public interface AuthenticationMethod {


    boolean login(String loginName, Map<LoginRequestType, String> loginRequest);
}
