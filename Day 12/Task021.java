import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task021 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);
        hm1.put("Kavitha", 101);
        hm1.put("Amritha", 102);
        hm1.put("Nisha", 103);

        System.out.println(hm1);
        System.out.println(syncMap);
    }
}