package de.tum.in.ase.eist;

import java.util.Map;

public class AdministratorGroup extends Group{

    private final BiometricAuthentication biometricAuthentication;

    public AdministratorGroup(BiometricAuthentication biometricAuthentication) {
        this.biometricAuthentication = biometricAuthentication;
    }

    @Override
    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return biometricAuthentication.login(loginName,request);
    }


    // TODO
}
