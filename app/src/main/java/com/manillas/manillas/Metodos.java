package com.manillas.manillas;

public class Metodos {

    public static int total(int opMaterial, int opDije, int opTipo, int cant){
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
                        break;
                    }
                    case 2:{
                        switch (opTipo) {
                            case 1: {
                                valor = cant * 120;
                                break;
                            }
                            case 2:{
                                valor = cant * 100;
                                break;
                            }
                            case 3: {
                                valor = cant * 90;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch (opDije) {
                    case 1: {
                        switch (opTipo) {
                            case 1: {
                                valor = cant * 90;
                                break;
                            }
                            case 2:{
                                valor = cant * 70;
                                break;
                            }
                            case 3: {
                                valor = cant * 50;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch (opTipo) {
                            case 1: {
                                valor = cant * 110;
                                break;
                            }
                            case 2:{
                                valor = cant * 90;
                                break;
                            }
                            case 3: {
                                valor = cant * 80;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        return valor;
    }



    public static int dolarAPeso(int dolares){
        return dolares * 3200;
    }
}
