package daily.Y2022.Jan.Jan10_AdditiveNumber;

import util.PrintUtil;

public class Jan10 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.isAdditiveNumber("112358")); // true
        PrintUtil.println(solution.isAdditiveNumber("199100199")); // true
        PrintUtil.println(solution.isAdditiveNumber("123")); // true
        PrintUtil.println(solution.isAdditiveNumber("111")); // false
        PrintUtil.println(solution.isAdditiveNumber("1023")); // false
        PrintUtil.println(solution.isAdditiveNumber("101")); // true
        PrintUtil.println(solution.isAdditiveNumber("1203")); // false
        PrintUtil.println(solution.isAdditiveNumber("0235813")); // false
        PrintUtil.println(solution.isAdditiveNumber("120122436")); // false
        PrintUtil.println(solution.isAdditiveNumber("000")); // true
        PrintUtil.println(solution.isAdditiveNumber("111122335588143")); // true
    }
}
