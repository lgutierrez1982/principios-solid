package com.solid.principles.design.app.dsi.bankapi.good;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(new MyBankPaymentProcessor(new BankApi()));
        store.purchase();

        Store store1 = new Store(new MyPayPalPaymentProcessor(new PayPalApi()));
        store1.purchase();

    }
}
