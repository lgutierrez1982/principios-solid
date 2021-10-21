package com.solid.principles.design.app.dsi.bankapi.good;

public class Store {

    protected IPaymentProcessor iPaymentProcessor;

    public Store(IPaymentProcessor iPaymentProcessor){

        this.iPaymentProcessor = iPaymentProcessor;
    }

    public void purchase(){
        this.iPaymentProcessor.pay();
    }

}
