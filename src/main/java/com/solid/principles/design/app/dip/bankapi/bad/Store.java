package com.solid.principles.design.app.dip.bankapi.bad;

public class Store {

    protected BankApi myBankApi;

    //modulo de alto nivel(Store) no debe depender del modulo de bajo nivel(MyBankApi)
    //Ambos deben depender de abstracciones
    public Store(BankApi myBankApi){
        this.myBankApi = myBankApi;
    }

    public void purchase(){
        this.myBankApi.charge();
    }
}
