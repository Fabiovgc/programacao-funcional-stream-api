package lam.funcionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java","Kotlin", "Python", "Javascript", "C", "Go", "Ruby");

        // criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        
        // USar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // Imprimir cada palavda que passou  no fuiiltro
        palavras.stream()
            .filter( p -> p.length() > 5)
            .forEach(System.out::println);
    }
}
