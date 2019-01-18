package Lesson8;

public class StringUtils {
    public static String codding(String message) {

        String alfavit = "abcdefghijklmnopqrstuvwyxz";
        char[] alfavitLittle = alfavit.toCharArray();
        char[] alfavitBig = alfavit.toUpperCase().toCharArray();

        char[] charsFromMessage = message.toCharArray();
        // for each
        for(char currentChar:charsFromMessage){
            int index = alfavit.indexOf(currentChar);
            index = index +3;
            char newChar = alfavit.charAt(index);
            System.out.print(newChar);
        }


        return null;

    }
}
