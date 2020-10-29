package com.paul;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBookImpl();

        String phoneNumber1 = "09099990099";
        PhoneNumberDetails phoneNumberDetails1 = new PhoneNumberDetails("Paul", "paul.gmail.com", new Date());

        try {
            phoneBook.storePhoneNumber(phoneNumber1, phoneNumberDetails1);
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

        String phoneNumber2 = "09099990099";
        PhoneNumberDetails phoneNumberDetails2 = new PhoneNumberDetails("Emmanuel", "emmanuel.gmail.com", new Date());

        try {
            phoneBook.storePhoneNumber(phoneNumber2, phoneNumberDetails2);
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

        String phoneNumber3 = "09012345678";
        PhoneNumberDetails phoneNumberDetails3 = new PhoneNumberDetails("Alice", "alice.gmail.com", new Date());

        try {
            phoneBook.storePhoneNumber(phoneNumber3, phoneNumberDetails3);
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

        try {
            System.out.println(phoneBook.getPhoneNumberDetails(phoneNumber3));
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

        String phoneNumber4 = "09098769876";
        try {
            System.out.println(phoneBook.getPhoneNumberDetails(phoneNumber4));
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

        System.out.println(phoneBook.getAllPhoneNumbers());

    }
}
