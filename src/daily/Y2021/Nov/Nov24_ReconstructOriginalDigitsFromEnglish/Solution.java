package daily.Y2021.Nov.Nov24_ReconstructOriginalDigitsFromEnglish;

class Solution {
    public String originalDigits(String s) {
        int[] flag = new int[10];
        DigitsMap map = new DigitsMap();
        for (int i = 0; i < s.length(); i++) {
            map.add(s.charAt(i));
        }

        // 有几个 x 就有几个 six
        flag[6] = map.subtractAll('x', "six".toCharArray());
        // 有几个 g 就有几个 eight
        flag[8] = map.subtractAll('g', "eight".toCharArray());
        // 有几个 z 就有几个 zero
        flag[0] = map.subtractAll('z', "zero".toCharArray());
        // 有几个 h 就有几个 three
        flag[3] = map.subtractAll('h', "three".toCharArray());
        // 除开 zero、three 后，有几个 r 就有几个 four
        flag[4] = map.subtractAll('r', "four".toCharArray());
        // 除开 four 后，有几个 f 就有几个 five
        flag[5] = map.subtractAll('f', "five".toCharArray());
        // 除开 five 后，有几个 v 就有几个 seven
        flag[7] = map.subtractAll('v', "seven".toCharArray());
        // 有几个 w 就有几个 two
        flag[2] = map.subtractAll('w', "two".toCharArray());
        // 除开 zero、two、four 后，有几个 o 就有几个 one
        flag[1] = map.subtractAll('o', "one".toCharArray());
        // 剩余有几个 i 就有几个 nine
        flag[9] = map.subtractAll('i', "nine".toCharArray());

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < flag.length; i++) {
            for (int count = 0; count < flag[i]; count++) {
                ans.append(i);
            }
        }
        return ans.toString();
    }

    private static final class DigitsMap {
        private final int[] map = new int[26];

        public void add(char c) {
            map[c - 'a']++;
        }

        public int subtractAll(char target, char... chars) {
            if (map[target - 'a'] <= 0) {
                return 0;
            }
            int value = map[target - 'a'];
            for (char character : chars) {
                map[character - 'a'] -= value;
            }
            return value;
        }
    }
}
