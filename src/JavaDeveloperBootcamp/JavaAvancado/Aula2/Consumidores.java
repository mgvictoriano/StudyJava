package JavaDeveloperBootcamp.JavaAvancado.Aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method Reference

//        - apenas
//        - utilizar o parametro da forma que ele foi recebido;


        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}