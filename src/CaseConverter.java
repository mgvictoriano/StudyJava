public class CaseConverter {

    /*
     * Convert Given String to Camel Case i.e.
     * Capitalize first letter of every word to upper case
     */
    String camelCase(String str)
    {

        str = str.substring(0, 1).toLowerCase()
                + str.substring(1);

        StringBuilder builder = new StringBuilder(str);
        // Flag to keep track if last visited character is a
        // white space or not
        boolean isLastSpace = true;

        // Iterate String from beginning to end.
        for(int i = 0; i < builder.length(); i++)
        {
            char letra = builder.charAt(i);

            if (builder.charAt(i) == '-' || builder.charAt(i) == '*' || builder.charAt(i) == ' ' || builder.charAt(i) == '_') {

                builder.deleteCharAt(i);
            }

            if(isLastSpace && letra >= 'a' && letra <='z')
            {
                // Character need to be converted to uppercase
                builder.setCharAt(i, (char)(letra + ('A' - 'a') ));
                isLastSpace = false;
            }
            else if (letra != ' ')
                isLastSpace = false;
            else
                isLastSpace = true;
        }

        return builder.toString();
    }
    public static void main(String[] args) {

        CaseConverter converter = new CaseConverter();

        String str = converter.camelCase("cats AND*Dogs-are Awesome");

        System.out.println(str);
    }
}

