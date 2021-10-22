package com.solid.principles.design.app.dip.bankapi.good;

//Adaptador
public class MyBankPaymentProcessor implements  IPaymentProcessor{

    private BankApi myBankApi;

    public MyBankPaymentProcessor(BankApi myBankApi) {
        this.myBankApi = myBankApi;
    }

    @Override
    public void pay() {
        this.myBankApi.charge();
    }
}
