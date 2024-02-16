//Write the suitable answers for each of the following for the string “Java is awesome!”
//
//        1.Question: What is the character at index 5 in the string "Java is awesome!"? (Use the charAt() method)
//        2.Question: How many characters are there in the string "Java is awesome!"? (Use the length() method)
//        3.Question: What is the substring starting from index 5 in the string "Java is awesome!"? (Use the substring() method:
//        4.Question: At which index does the substring "is" first occur in the string "Java is awesome!"?( Use the indexOf() method:
//        5.Question: Convert the string "Java is awesome!" to uppercase. (Use the toUpperCase() method)
//        6.Question: Convert the string "Java is awesome!" to lowercase. (Use the toLowerCase() method)
//        7.Question: Replace the word "awesome" with "amazing" in the string "Java is awesome!". (Use the replace() method)


class string_assignment {
    public static void ONE(String[] args) {
        String example = "Java is Awesome";
        char fifth_character = example.charAt(5);
        System.out.println(fifth_character);
    }

    public static void TWO(String[] args) {
        String example = "Java is Awesome";
        int length = example.length();
        System.out.println(length);
    }

    public static void THREE(String[] args) {
        String example = "Java is Awesome";
        String substring = example.substring(5);
        System.out.println(substring);
    }
    public static void FOUR(String[] args) {
        String example = "Java is Awesome";
        String index_of = String.valueOf(example.indexOf("is"));
        System.out.println(index_of);
    }
    public static void FIVE(String[] args) {
        String example = "Java is Awesome";
        String upper = example.toUpperCase();
        System.out.println(upper);
    }
    public static void SIX(String[] args) {
        String example = "Java is Awesome";
        String lower = example.toLowerCase();
        System.out.println(lower);
    }
    public static void SEVEN(String[] args) {
        String example = "Java is Awesome";
        String replace= example.replace("awesome", "amazing");
        System.out.println(replace);
    }
}
