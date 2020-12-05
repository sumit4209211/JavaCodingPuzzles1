class GFG11 {

    // Function to check if the String is all whitespaces
    public static boolean isStringAllWhiteSpace(String str)
    {

        // Remove the leading whitespaces using trim()
        // and then check if this string is empty
        if (str.trim().isEmpty())
            return true;
        else
            return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "GeeksforGeeks";
        String str2 = "              ";

        System.out.println("Is string [" + str1
                + "] only whitespaces? "
                + isStringAllWhiteSpace(str1));
        System.out.println("Is string [" + str2
                + "] only whitespaces? "
                + isStringAllWhiteSpace(str2));
    }
}
