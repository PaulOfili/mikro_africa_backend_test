package com.paul;

import java.util.Set;

public interface PhoneBook {
    void storePhoneNumber(String phoneNumber, PhoneNumberDetails phoneNumberDetails) throws Exception;
    PhoneNumberDetails getPhoneNumberDetails(String phoneNumber) throws Exception;
    Set<String> getAllPhoneNumbers();
}
