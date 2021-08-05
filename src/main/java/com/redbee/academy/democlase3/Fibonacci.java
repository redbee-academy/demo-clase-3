package com.redbee.academy.democlase3;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> serieFibonacci(Integer cantidadElementos) {
        Integer a = 0;
        Integer b = 1;
        List<Integer> resultado = new ArrayList<>();

        if (cantidadElementos > 1) {
            resultado.add(a);
            resultado.add(b);
        }

        for (var i = 1; i < cantidadElementos - 1; i++) {
            Integer siguienteNumero = resultado.get(i) + resultado.get(i - 1);
            resultado.add(siguienteNumero);
        }

        return resultado;
    }

    public static Integer fibonacciAt(Integer posicion) {
        Integer resultado = 0;
        if (posicion > 1) {
            resultado = fibonacciAt(posicion - 1) + fibonacciAt(posicion - 2);
        } else if (posicion == 0 || posicion == 1) {
            resultado = posicion;
        }
        return resultado;
    }
}
