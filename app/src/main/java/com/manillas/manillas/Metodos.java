package com.manillas.manillas;

public class Metodos {

    public static int total(int opMaterial, int opDije, int opTipo, int opMoneda, int cant){
        int valor = 0;
        switch (opMaterial) {
            case 1: {
                switch (opDije) {
                    case 1: {
                        switch (opTipo) {
                            case 1: {
                                valor = cant * 100;
                                break;
                            }
                            case 2:{
                                valor = cant * 80;
                                break;
                            }
                            case 3: {
                                valor = cant * 70;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return valor;
    }



    public int dolarAPeso(int dolares){
        return dolares * 3200;
    }
}
