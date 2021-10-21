package com.solid.principles.design.app.dsi.bankapi.bad;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(new BankApi());
        store.purchase();
    }


}
