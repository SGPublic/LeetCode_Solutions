package daily.Y2021.Nov.Nov28_FindAllAnagramsInAString;

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        // 容错，数据点中存在 p 长度大于 s 长度的情况
        if (p.length() > s.length()) {
            return ans;
        }
        /* 根据题意，我们只需要记录字符串中出现的字母及其出
           现的次数是否与目标字符串相同即可 */
        int[] origin = new int[26];
        int[] current = new int[26];
        for (int i = 0; i < p.length(); i++) {
            origin[p.charAt(i) - 'a']++;
            current[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(origin, current)) {
            ans.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            // 删除当前区间第一个 char
            current[s.charAt(i) - 'a']--;
            // 记录下一区间最后一个 char
            current[s.charAt(i + p.length()) - 'a']++;
            if (Arrays.equals(origin, current)) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}