package lam.funcionalinterface.fun;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar funçãl para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
