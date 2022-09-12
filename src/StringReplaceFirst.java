public class StringReplaceFirst {

    // Function to convert the string
    // from snake case to camel case
    public static String
    snakeToCamel(String str)
    {
        // Capitalize first letter of string
        str = str.substring(0, 1).toUpperCase()
                + str.substring(1);

        // Run a loop till string
        // string contains underscore
        while (str.contains("-")) {

            // Replace the first occurrence
            // of letter that present after
            // the underscore, to capitalize
            // form of next letter of underscore
            str = str
                    .replaceFirst(
                            "_[a-z]",
                            String.valueOf(
                                    Character.toUpperCase(
                                            str.charAt(
                                                    str.indexOf("-") + 1))));
        }

        // Return string
        return str;
    }

    // Driver Code
    public static void
    main(String args[])
    {
        // Given string
        String str = "cats AND*Dogs-are Awesome";

        // Print the modified string
        System.out.print(snakeToCamel(str));
    }
}
