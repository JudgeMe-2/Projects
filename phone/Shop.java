package com.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).setProcessor("QualComm").getPhone();

        System.out.println(p);
    }
}
