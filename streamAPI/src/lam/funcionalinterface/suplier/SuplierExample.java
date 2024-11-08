package lam.funcionalinterface.suplier;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExample {
    public static void main(String[] args) {
        // Usar o supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")
        .limit(5)
        .collect(Collectors.toList());
        

        // Imprimir saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
