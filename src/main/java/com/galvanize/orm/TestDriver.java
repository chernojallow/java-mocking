//package com.galvanize.orm;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestDriver {
//}


package com.galvanize.orm;
        import java.util.HashMap;
        import java.util.Map;

public class TestDriver implements Driver {
    Map<Integer, Object> saved = new HashMap<>();
    public void save(Object obj) {
        System.out.println("Saving object: " + obj);
        saved.put(obj.hashCode(), obj);
    }
    public Object get(int id) {
        System.out.println("Retrieving object with id: " + id);
        return saved.get(id);
    }
}

