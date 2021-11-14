package Y2021.Nov.Nov14;

import java.util.HashMap;

class MapSum extends HashMap<String, Integer> {
    public void insert(String key, int val) {
        super.put(key, val);
    }

    public int sum(String prefix) {
        int ans = 0;
        for (String s : super.keySet()) {
            if (s.startsWith(prefix)) {
                ans += super.get(s);
            }
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
