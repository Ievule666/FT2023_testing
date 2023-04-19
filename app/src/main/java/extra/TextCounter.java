package extra;

public class TextCounter {
    public static int getWordsCount(String input) {
        String words = input.trim();
        return words.split("\\s+").length;
    }

    public static int getCharsCount(String inputString){
        return Integer.parseInt("-1");

    }

    public static int countWhitespaces(String input) {
        int count = 0;
        char[] words = input.toCharArray();
        for (char c : words) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return 0;
    }}