package com.redbee.academy.democlase3;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {

    public static List<Integer> ordenar(List<Integer> lista) {

        List<Integer> listaEntrante = new ArrayList<>(lista);
        for (var i = 0; i < listaEntrante.size() - 1; i++) {
            for (var j = 0; j < listaEntrante.size() - 1 - i; j++) {
                if (listaEntrante.get(j) > listaEntrante.get(j + 1)) {
                    Integer aux = listaEntrante.get(j + 1);
                    listaEntrante.set(j + 1, listaEntrante.get(j));
                    listaEntrante.set(j, aux);
                }
            }
        }

        return listaEntrante;

    }
}
