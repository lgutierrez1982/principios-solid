package com.solid.principles.design.app.dsi.impresora.bad;

public class Impresora {

    //A tener en cuenta
    //Los modulos de alto nivel no deben depender de los modulos de bajo nivel
    //Ambos deben depender de abstracciones
    public void imprimir(Factura factura){
        System.out.println("Imprimiendo factura numero "
                .concat(factura.getNumero().toString())
                .concat(" del ")
                .concat(factura.getFecha().toString())
                .concat(" por el monto de ")
                .concat(factura.getImporte().toString()));
    }

    public void imprimir(NotaCredito notaCredito){
        System.out.println("Imprimiendo nota de credito numero "
                .concat(notaCredito.getNumero().toString())
                .concat(" del ")
                .concat(notaCredito.getFecha().toString())
                .concat(" por el monto de ")
                .concat(notaCredito.getImporte().toString()));
    }

    public void imprimir(FacturaLuz facturaLuz){
        System.out.println("Imprimiendo factura de luz codigo "
                .concat(facturaLuz.getCodigoPago().toString())
                .concat(" por el monto de ")
                .concat(facturaLuz.getImporte().toString()));
    }

    public void imprimir(Municipal municipal){
        System.out.println("Imprimiendo municipal de luz partida "
                .concat(municipal.getPartida().toString())
                .concat(" por el monto de ")
                .concat(municipal.getImporte().toString()));
    }

    public void imprimir(ReciboSueldo reciboSueldo){
        System.out.println("Imprimiendo recibo sueldo letajo "
                .concat(reciboSueldo.getLagajo().toString())
                .concat(" por el monto de ")
                .concat(reciboSueldo.getTotal().toString()));
    }

    public void imprimir(Remito remito){
        System.out.println("Imprimiendo remito numero "
                .concat(remito.getNumero().toString())
                .concat(" del ")
                .concat(remito.getFecha().toString())
                .concat(" con una cantidad de bultos ")
                .concat(remito.getCantBultos().toString()));
    }

}
