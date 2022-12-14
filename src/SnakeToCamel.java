public class SnakeToCamel {

    // Function to convert snake case
    // to camel case
    public static String snakeToCamel(String str)
    {
        // Capitalize first letter of string
        str = str.substring(0).toLowerCase();

        // Convert to StringBuilder
        StringBuilder builder
                = new StringBuilder(str);

        // Traverse the string character by
        // character and remove underscore
        // and capitalize next letter
        for (int i = 0; i < builder.length(); i++) {

            // Check char is underscore


            if (builder.charAt(i) == '-' || builder.charAt(i) == '*' || builder.charAt(i) == ' ' || builder.charAt(i) == '_') {

                builder.deleteCharAt(i);
                builder.replace(
                        i, i + 1,
                        String.valueOf(
                                Character.toUpperCase(
                                        builder.charAt(i))));

            }

        }

        // Return in String type
        return builder.toString();
    }

    // Driver Code
    public static void
    main(String[] args)
    {

        // Given String
        String str = "cats AND*Dogs-are Awesome";

        // Function Call
        str = snakeToCamel(str);

        // Modified String
        System.out.println(str);
    }
}
