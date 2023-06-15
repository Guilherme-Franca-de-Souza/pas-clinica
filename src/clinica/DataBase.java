package clinica;

import java.util.*;

public class DataBase {

    private Map<String, List> tables;

    public DataBase() {
        tables = new HashMap<>();
    }

    public void createTable(Class<?> clazz) {
        List list = new ArrayList();
        tables.put(clazz.getName(), list);
    }

    public void insert(Object obj) {
        List list = tables.get(obj.getClass().getName());
        list.add(obj);
    }

    public Object getElement(Class<?> clazz, int index) {
        List list = tables.get(clazz.getName());
        return list.get(index);
    }
}
