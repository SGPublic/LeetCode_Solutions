package util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Reflection<T> {
    private final T object;

    private Reflection(T object) {
        this.object = object;
    }

    public <RESULT> RESULT involve(String methodName, Object... args)
            throws Throwable {
        Method method = object.getClass().getMethod(
                methodName, getClasses(args)
        );
        method.setAccessible(true);
        try {
            return (RESULT) method.invoke(object, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    public static <RESULT, TARGET> RESULT involve(Class<TARGET> clazz, String methodName, Object... args)
            throws Throwable {
        Method method = clazz.getMethod(
                methodName, getClasses(args)
        );
        method.setAccessible(true);
        try {
            return (RESULT) method.invoke(null, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static Class<?>[] getClasses(Object[] args) {
        Class<?>[] classes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            Class<?> clazz = args[i].getClass();
            try {
                Field type = clazz.getField("TYPE");
                type.setAccessible(true);
                clazz = (Class<?>) type.get(null);
            } catch (NoSuchFieldException | IllegalAccessException ignore){
            } finally {
                classes[i] = clazz;
            }
        }
        return classes;
    }

    public static <TARGET> Reflection<TARGET> getInterface(TARGET object) {
        return new Reflection<>(object);
    }
}
