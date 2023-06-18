package clinica;

import java.util.*;
import java.lang.reflect.Method;

public class BancoDeDados {

    private Map<String, List> tables;
    
    private static BancoDeDados instancia = new BancoDeDados();
	
	
	public static BancoDeDados getInstance() {
        return instancia;
    }

    public BancoDeDados() {
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

    public Object select(Class<?> clazz, int index) {
        List list = tables.get(clazz.getName());
        return list.get(index);
    }

    public Object select(Class<?> clazz, String name) {
        List<?> list = tables.get(clazz.getName());
        for (Object obj : list) {
            try {
                Method method = obj.getClass().getMethod("getNome");
                Object result = method.invoke(obj);
                if (result != null && result.equals(name)) {
                    return obj;
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
