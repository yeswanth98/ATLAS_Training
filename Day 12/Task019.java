import java.util.HashMap;
import java.util.Map;

public class Task019 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        hm.put(null, 101);
        hm.put(1003, 102);
        hm.put(1008, 103);

        hm2.put("HI", "Yeswanth");
        hm2.put("Hello","Nisha");

        System.out.println(hm);
        System.out.println(hm2);

        // HashMap<String, Integer> combinedMap = new HashMap<>();
        // combinedMap.putAll(hm);
        // combinedMap.putAll(hm2);
        // for (Map.Entry<String, Integer> e : combinedMap.entrySet())
        //     System.out.println(e.getKey() + " " + e.getValue());
    }
}