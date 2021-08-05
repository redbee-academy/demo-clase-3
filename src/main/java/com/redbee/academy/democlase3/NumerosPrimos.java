package com.redbee.academy.democlase3;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    // cantidad
    // inicio

    public static List<Integer> listaNumerosPrimos(Integer cantidad, Integer desde) {
        List<Integer> numerosPrimos = new ArrayList<>();
        Integer indice = desde;

        while(cantidad > numerosPrimos.size() ) {
            if(esPrimo(indice)) {
                numerosPrimos.add(indice);
            }
            indice++;
        }

        return numerosPrimos;
    }

    public static Boolean esPrimo(Integer numero) {
        //%
        Boolean numeroPrimo = true;
        Integer contador = 2;

        if(numero <= 1) {
            numeroPrimo = false;
        }

        while (numeroPrimo && contador <= Math.round(Math.sqrt(numero))) {
            if (numero % contador == 0) {
                numeroPrimo = false;
            }
            contador++;
        }

        return numeroPrimo;
    }
}
