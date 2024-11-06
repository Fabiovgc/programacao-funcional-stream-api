package lam.funcionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero%2==0){
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().filter(n -> n % 2 == 0)
        .forEach(System.out::println);
        
    }
}
