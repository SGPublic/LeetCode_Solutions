package daily.Y2021.Nov.Nov22_ShuffleAnArray;

import util.PrintUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Nov22 {
    public static void main(String[] args)
            throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        solution(
                new Solution(new int[]{1, 2, 3}),
                new String[]{"shuffle", "reset", "shuffle"}
        );
    }

    @SuppressWarnings("SameParameterValue")
    private static void solution(Solution s, String[] steps)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (String step : steps) {
            Method method = Solution.class.getMethod(step);
            PrintUtil.println((int[]) method.invoke(s));
        }
        PrintUtil.println();
    }
}
