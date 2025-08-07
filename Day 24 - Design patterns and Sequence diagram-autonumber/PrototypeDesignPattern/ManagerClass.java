package PrototypeDesignPattern;
import java.util.HashMap;
import java.util.Map;

class CloneOfHuman {
    private static Map<String, HumanBeing> sizeMap = new HashMap<>();

    public static void loadCache() {
        sizeMap.put("SpiderMan", new SpiderMan("Peter Parker"));
        sizeMap.put("BatMan", new BatMan("Bruce Wayne"));
        sizeMap.put("IronMan", new IronMan("Tony Stark"));
    }

    public static HumanBeing getClone(String type) {
        HumanBeing prototype = sizeMap.get(type);
        return prototype != null ? prototype.clone() : null;
    }
}