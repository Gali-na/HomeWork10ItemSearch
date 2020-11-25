import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingDuplicateItems<T> {
    private Map<T, Integer> map;

    public CountingDuplicateItems() {
        this.map = new HashMap<>();
    }

    public Map<T, Integer> getMap() {
        return map;
    }

    public String countDublicate(T[] arry) {
        String rezult = "";
        for (int i = 0; i < arry.length; i++) {
            Integer element = this.map.get(arry[i]);
            if (element != null) {
                map.put(arry[i], element + 1);
            } else {
                map.put(arry[i], 1);
            }
        }
        Set<T> kys = this.map.keySet();
        for (T s : kys) {
            rezult = rezult + "\n" + s + " " + this.map.get(s) + " repetitions";
        }
        return rezult;
    }
}
