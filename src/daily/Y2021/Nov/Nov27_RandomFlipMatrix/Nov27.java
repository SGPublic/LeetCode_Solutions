package daily.Y2021.Nov.Nov27_RandomFlipMatrix;

import util.PrintUtil;
import util.Reflection;

public class Nov27 {
    public static void main(String[] args) throws Throwable {
        Solution solution = new Solution(3, 1);
        Reflection<Solution> reflection = Reflection.getInterface(solution);
        PrintUtil.println((int[]) reflection.involve("flip"));
        PrintUtil.println((int[]) reflection.involve("flip"));
        PrintUtil.println((int[]) reflection.involve("flip"));
        reflection.involve("reset");
        PrintUtil.println((int[]) reflection.involve("flip"));
    }
}
