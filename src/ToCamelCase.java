public class ToCamelCase {

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}

