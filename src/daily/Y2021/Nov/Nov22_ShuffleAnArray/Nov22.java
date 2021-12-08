package daily.Y2021.Nov.Nov22_ShuffleAnArray;

import util.PrintUtil;
import util.Reflection;

import java.lang.reflect.InvocationTargetException;

public class Nov22 {
    public static void main(String[] args)
            throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Reflection<Solution> reflection = Reflection.getInterface(
                new Solution(new int[] { 1, 2, 3 })
        );
        PrintUtil.println((int[]) reflection.involve("shuffle"));
        reflection.involve("reset");
        PrintUtil.println((int[]) reflection.involve("shuffle"));
    }
}
