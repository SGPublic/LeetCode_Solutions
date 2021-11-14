package Y2021.Nov.Nov13;

class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if (Character.isLowerCase(chars[0])) {
            for (char aChar : chars) {
                if (Character.isUpperCase(aChar)) {
                    return false;
                }
            }
            return true;
        }
        if (chars.length < 2) {
            return true;
        }
        boolean flag = Character.isLowerCase(chars[1]);
        for (int i = 2; i < chars.length; i++) {
            if (flag ^ Character.isLowerCase(chars[i])) {
                return false;
            }
        }
        return true;
    }
}
