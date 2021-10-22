package com.solid.principles.design.app.dip.bankapi.good;

public class MyPayPalPaymentProcessor implements IPaymentProcessor{

    private PayPalApi payPalApi;

    public MyPayPalPaymentProcessor(PayPalApi payPalApi) {
        this.payPalApi = payPalApi;
    }

    @Override
    public void pay() {
        payPalApi.chargeCustomer();
    }
}
