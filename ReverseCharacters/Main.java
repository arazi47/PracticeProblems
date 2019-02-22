/*
    Given a string, that contains special character together with alphabets
    (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way
    that special characters are not affected.

    a!!!b.c.d,e'f,ghi => i!!!h.g.f,e'd,cba
 */

public class Main {
    private static void reverseCharacters(char str[]) {
        int l = 0, r = str.length - 1;
        while (l < r) {
            if (!Character.isAlphabetic(str[l])) {
                ++l;
            }

            if (!Character.isAlphabetic(str[r])) {
                --r;
            }

            if (Character.isAlphabetic(str[l]) && Character.isAlphabetic(str[r])) {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                ++l;
                --r;
            }

        }
    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char strChar[] = str.toCharArray();
        reverseCharacters(strChar);
        String result = new String(strChar);

        System.out.println(str);
        System.out.println(result);
    }
}
