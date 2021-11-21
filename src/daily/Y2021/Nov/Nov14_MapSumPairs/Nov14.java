package daily.Y2021.Nov.Nov14_MapSumPairs;

import util.PrintUtil;

public class Nov14 {
    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        PrintUtil.println(mapSum.sum("ap"));
        mapSum.insert("app", 2);
        PrintUtil.println(mapSum.sum("ap"));
    }
}
