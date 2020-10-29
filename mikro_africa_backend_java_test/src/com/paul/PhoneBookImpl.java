package com.paul;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBookImpl implements PhoneBook {
    private Map<String, PhoneNumberDetails> phoneNumbers = new HashMap<>();

    @Override
    public void storePhoneNumber(String phoneNumber, PhoneNumberDetails phoneNumberDetails) throws Exception {
        if (phoneNumbers.containsKey(phoneNumber)){
            throw new Exception("An entry with this phone number already exists. Please store a unique phone number!");
        } else {
            phoneNumbers.put(phoneNumber, phoneNumberDetails);
        }

    }

    @Override
    public PhoneNumberDetails getPhoneNumberDetails(String phoneNumber) throws Exception {
        if (phoneNumbers.containsKey(phoneNumber)) {
            return phoneNumbers.get(phoneNumber);
        } else {
            throw new Exception("No entry with this phone number exists in the phonebook yet!");
        }
    }

    @Override
    public Set<String> getAllPhoneNumbers() {
        return phoneNumbers.keySet();
    }
}
