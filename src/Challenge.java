import java.util.*;
import java.util.Arrays;

import static java.util.stream.Collectors.toSet;

public class Challenge {

    public static String ArrayChallenge(String[] strArr) {

        String algumNome = strArr[0];

        Set<String> palavras = Arrays.stream(strArr[1].split(",")).collect(toSet());

        for (int i = 0; i < algumNome.length(); i++) {
            String primeiraPalavra = algumNome.substring(0, i);
            String segundaPalavra = algumNome.substring(i);

            if (palavras.contains(primeiraPalavra) && palavras.contains(segundaPalavra)) {
                return primeiraPalavra + "," + segundaPalavra;
            }
        }

        return "empty";
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        System.out.println(ArrayChallenge(arr));

    }
}