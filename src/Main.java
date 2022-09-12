import java.util.*;
import java.io.*;
import java.util.Arrays;
import static java.util.stream.Collectors.toSet;

class Main {

    public Object converter(String nome) {
        char[] palavras = nome.toCharArray();


        for(int i = 1; i < palavras.length; i++) {
            //convertendo todas as letras para minúsculo para casos como tEsTe = teste
            if(Character.isAlphabetic(palavras[i])) {
                palavras[i] = Character.toLowerCase(palavras[i]);
            }
            //se o carácter anterior for espaço então o atual sera maiúsculo
            if(Character.isWhitespace(palavras[i - 1])) {
                palavras[i] = Character.toUpperCase(palavras[i]);
            }
        }
        //por fim a primeira letra de toda frase ou palavra será maiúscula
        palavras[0] = Character.toUpperCase(palavras[0]);

        //retorna o Array de char como String
        String nomeConvertido = new String(palavras);

        return nomeConvertido;
    }

}